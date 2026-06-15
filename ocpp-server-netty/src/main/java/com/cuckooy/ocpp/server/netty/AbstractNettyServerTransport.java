package com.cuckooy.ocpp.server.netty;

import com.cuckooy.ocpp.core.exception.OcppException;
import com.cuckooy.ocpp.core.message.OcppCallErrorMessage;
import com.cuckooy.ocpp.core.message.OcppCallMessage;
import com.cuckooy.ocpp.core.message.OcppCallResultMessage;
import com.cuckooy.ocpp.core.message.OcppMessage;
import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.json.OcppJsonParser;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.netty.bridge.MessageBridgingService;
import com.cuckooy.ocpp.server.netty.bridge.NoopMessageBridgingService;
import com.cuckooy.ocpp.server.netty.promise.PromiseContextHolder;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractNettyServerTransport implements ServerTransport {

    private static final String OCPP_LOGGER = "OCPP.Logger";

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Logger ocppLogger = LoggerFactory.getLogger(OCPP_LOGGER);

    private final OcppJsonParser ocppJsonParser;
    private final OcppJsonWriter ocppJsonWriter;
    private final UniqueIdRepository uniqueIdRepository;
    private final CentralSystemService centralSystemService;
    private final MessageBridgingService messageBridgingService;

    protected AbstractNettyServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                           UniqueIdRepository uniqueIdRepository,
                                           CentralSystemService centralSystemService) {
        Objects.requireNonNull(ocppJsonParser, "ocppJsonParser cannot be null");
        Objects.requireNonNull(ocppJsonWriter, "ocppJsonWriter cannot be null");
        Objects.requireNonNull(uniqueIdRepository, "uniqueIdRepository cannot be null");
        Objects.requireNonNull(centralSystemService, "centralSystemService cannot be null");
        this.ocppJsonParser = ocppJsonParser;
        this.ocppJsonWriter = ocppJsonWriter;
        this.uniqueIdRepository = uniqueIdRepository;
        this.centralSystemService = centralSystemService;
        this.messageBridgingService = new NoopMessageBridgingService();
    }

    protected AbstractNettyServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                           UniqueIdRepository uniqueIdRepository,
                                           CentralSystemService centralSystemService,
                                           MessageBridgingService messageBridgingService) {
        Objects.requireNonNull(ocppJsonParser, "ocppJsonParser cannot be null");
        Objects.requireNonNull(ocppJsonWriter, "ocppJsonWriter cannot be null");
        Objects.requireNonNull(uniqueIdRepository, "uniqueIdRepository cannot be null");
        Objects.requireNonNull(centralSystemService, "centralSystemService cannot be null");
        Objects.requireNonNull(messageBridgingService, "messageBridgingService cannot be null");
        this.ocppJsonParser = ocppJsonParser;
        this.ocppJsonWriter = ocppJsonWriter;
        this.uniqueIdRepository = uniqueIdRepository;
        this.centralSystemService = centralSystemService;
        this.messageBridgingService = messageBridgingService;
    }

    @Override
    public void receive(Channel channel, String message) {
        if (logger.isDebugEnabled()) {
            logger.debug("Recv message, channel: {}, message: {}", channel.id().asShortText(), message);
        }

        loggerOcppMessage(channel, message);
        messageBridgingService.onMessage(channel, message);

        OcppMessage ocppMessage;
        try {
            ocppMessage = ocppJsonParser.readJson(message);
        } catch (OcppException e) {
            logger.error("Parse failed, message: {}", message, e);
            OcppCallErrorMessage callError = new OcppCallErrorMessage(e.getUniqueId(), e.getCode(), e.getDetails());
            onFailure(channel, callError);
            return;
        }

        if (ocppMessage instanceof OcppCallMessage call) {
            handleCall(channel, message, call);
        } else if (ocppMessage instanceof OcppCallResultMessage result) {
            handleCallResult(channel, message, result);
        } else if (ocppMessage instanceof OcppCallErrorMessage error) {
            handleCallError(channel, message, error);
        } else {
            throw new IllegalStateException("Unsupported ocpp message: " + message);
        }
    }

    @Override
    public Response send(Channel channel, Request request) {
        if (logger.isDebugEnabled()) {
            logger.debug("Send request, channel: {}, request: {}", channel.id().asShortText(), request);
        }

        String uniqueId = UUID.randomUUID().toString();
        uniqueIdRepository.save(uniqueId, request.action());

        CompletableFuture<Response> promise = PromiseContextHolder.prepare(uniqueId);

        OcppCallMessage message = new OcppCallMessage(uniqueId, request.action(), request);
        String serialized = ocppJsonWriter.writeJson(message);

        try {
            loggerOcppMessage(channel, serialized);
            channel.writeAndFlush(new TextWebSocketFrame(serialized));
            messageBridgingService.onMessage(channel, serialized);
            if (logger.isDebugEnabled()) {
                logger.debug("Send message, channel: {}, message: {}", channel.id().asShortText(), serialized);
            }
        } catch (Exception e) {
            logger.error("Send websocket text message failed.", e);
            promise.completeExceptionally(e);
        }

        try {
            return promise.get(3000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            PromiseContextHolder.remove(uniqueId);
            throw new RuntimeException(e);
        }
    }

    private void handleCall(Channel channel, String message, OcppCallMessage call) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle Call, channel: {}, message: {}", channel.id().asShortText(), message);
        }
        String identity = getIdentity(channel);
        Request request = call.getPayload();
        Response response = centralSystemService.handle(identity, request);
        OcppCallResultMessage callResult = new OcppCallResultMessage(call.getUniqueId(), response);
        onSuccess(channel, callResult);
    }

    private void handleCallResult(Channel channel, String message, OcppCallResultMessage callResult) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle CallResult, channel: {}, message: {}", channel.id().asShortText(), message);
        }

        Optional<CompletableFuture<Response>> future = PromiseContextHolder.get(callResult.getUniqueId());
        if (future.isPresent()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Promise found, CompletableFuture handle result response, channel: {}, message: {}",
                    channel.id().asShortText(),
                    message);
            }
            future.get().complete(callResult.getPayload());
            PromiseContextHolder.remove(callResult.getUniqueId());
        } else {
            logger.warn("Promise not found, uniqueId: {}", callResult.getUniqueId());
        }
    }

    private void handleCallError(Channel channel, String message, OcppCallErrorMessage callError) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle CallError, channel: {}, message: {}", channel.id().asShortText(), message);
        }
        Optional<CompletableFuture<Response>> future = PromiseContextHolder.get(callError.getUniqueId());
        if (future.isPresent()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Promise found, CompletableFuture handle error response, channel: {}, message: {}",
                    channel.id().asShortText(),
                    message);
            }
            PromiseContextHolder.remove(callError.getUniqueId());
        } else {
            if (logger.isDebugEnabled()) {
                logger.debug(
                    "Promise not found, CentralSystemOperations handle error response, channel: {}, message: {}",
                    channel.id().asShortText(),
                    message);
            }
        }
    }

    private void onSuccess(Channel channel, OcppCallResultMessage message) {
        String serialized = ocppJsonWriter.writeJson(message);
        if (logger.isDebugEnabled()) {
            logger.info("Send call result, channel: {}, message: {}", channel.id().asShortText(), serialized);
        }
        try {
            loggerOcppMessage(channel, serialized);
            channel.writeAndFlush(new TextWebSocketFrame(serialized));
            messageBridgingService.onMessage(channel, serialized);
        } catch (Exception e) {
            logger.error("Send websocket text message failed.", e);
        }
    }

    private void onFailure(Channel channel, OcppCallErrorMessage message) {
        String serialized = ocppJsonWriter.writeJson(message);
        if (logger.isDebugEnabled()) {
            logger.debug("Send call error, channel: {}, message: {}", channel.id().asShortText(), serialized);
        }
        try {
            loggerOcppMessage(channel, serialized);
            channel.writeAndFlush(new TextWebSocketFrame(serialized));
            messageBridgingService.onMessage(channel, serialized);
        } catch (Exception e) {
            logger.error("Send websocket text message failed.", e);
        }
    }

    private void loggerOcppMessage(Channel channel, String message) {
        String identity = getIdentity(channel);
        String protocol = getProtocol(channel);
        ocppLogger.info("Identity:\t{},\nChannel:\t{},\nProtocol:\t{},\nMessage:\t{}",
            identity,
            channel.id().asShortText(),
            protocol,
            message);
    }

    private static String getIdentity(Channel channel) {
        String identity = channel.attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
        if (identity == null) {
            throw new IllegalStateException("Missing Charge Point identity");
        }
        return identity;
    }

    private static String getProtocol(Channel channel) {
        String protocol = channel.attr(ChannelAttributes.CHARGE_POINT_PROTOCOL).get();
        return protocol != null ? protocol : "unknown";
    }
}
