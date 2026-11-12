package com.cuckooy.ocpp.server;

import com.cuckooy.ocpp.core.exception.OcppException;
import com.cuckooy.ocpp.core.message.*;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.json.OcppJsonParser;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.logger.MessageLoggingService;
import com.cuckooy.ocpp.server.logger.StdioMessageLoggingService;
import com.cuckooy.ocpp.server.promise.Promise;
import com.cuckooy.ocpp.server.promise.PromiseRepository;
import com.cuckooy.ocpp.server.promise.PromiseUnfulfilledException;
import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * The type Abstract server transport.
 */
public abstract class AbstractServerTransport implements ServerTransport {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    private final OcppJsonParser ocppJsonParser;
    private final OcppJsonWriter ocppJsonWriter;
    private final PromiseRepository promiseRepository;
    private final UniqueIdRepository uniqueIdRepository;
    private final CentralSystemService centralSystemService;
    private final MessageLoggingService messageLoggingService;

    /**
     * Instantiates a new Abstract server transport.
     *
     * @param ocppJsonParser       the ocpp json parser
     * @param ocppJsonWriter       the ocpp json writer
     * @param promiseRepository    the promise repository
     * @param uniqueIdRepository   the unique id repository
     * @param centralSystemService the central system service
     */
    public AbstractServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                   PromiseRepository promiseRepository, UniqueIdRepository uniqueIdRepository,
                                   CentralSystemService centralSystemService) {
        Assert.notNull(ocppJsonParser, "ocppJsonParser cannot be null");
        Assert.notNull(ocppJsonWriter, "ocppJsonWriter cannot be null");
        Assert.notNull(ocppJsonWriter, "promiseRepository cannot be null");
        Assert.notNull(uniqueIdRepository, "uniqueIdRepository cannot be null");
        Assert.notNull(centralSystemService, "centralSystemService cannot be null");
        this.ocppJsonParser = ocppJsonParser;
        this.ocppJsonWriter = ocppJsonWriter;
        this.promiseRepository = promiseRepository;
        this.uniqueIdRepository = uniqueIdRepository;
        this.centralSystemService = centralSystemService;
        this.messageLoggingService = new StdioMessageLoggingService();
    }

    /**
     * Instantiates a new Abstract server transport.
     *
     * @param ocppJsonParser        the ocpp json parser
     * @param ocppJsonWriter        the ocpp json writer
     * @param promiseRepository     the promise repository
     * @param uniqueIdRepository    the unique id repository
     * @param centralSystemService  the central system service
     * @param messageLoggingService the message bridging service
     */
    public AbstractServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                   PromiseRepository promiseRepository, UniqueIdRepository uniqueIdRepository,
                                   CentralSystemService centralSystemService,
                                   MessageLoggingService messageLoggingService) {
        Assert.notNull(ocppJsonParser, "ocppJsonParser cannot be null");
        Assert.notNull(ocppJsonWriter, "ocppJsonWriter cannot be null");
        Assert.notNull(ocppJsonWriter, "promiseRepository cannot be null");
        Assert.notNull(uniqueIdRepository, "uniqueIdRepository cannot be null");
        Assert.notNull(centralSystemService, "centralSystemService cannot be null");
        Assert.notNull(centralSystemService, "messageBridgingService cannot be null");
        this.ocppJsonParser = ocppJsonParser;
        this.ocppJsonWriter = ocppJsonWriter;
        this.promiseRepository = promiseRepository;
        this.uniqueIdRepository = uniqueIdRepository;
        this.centralSystemService = centralSystemService;
        this.messageLoggingService = messageLoggingService;
    }


    @Override
    public void receive(WebSocketSession session, String message) {
        if (logger.isDebugEnabled()) {
            logger.debug("Recv message, session: {}, message: {}", session.getId(), message);
        }

        messageLoggingService.log(session, message);

        OcppMessage ocppMessage;
        try {
            ocppMessage = ocppJsonParser.readJson(message);
        } catch (OcppException e) {
            logger.error("Parse failed, message: {}", message, e);
            OcppCallErrorMessage callError = new OcppCallErrorMessage(e.getUniqueId(), e.getCode(), e.getDetails());
            onFailure(session, callError);
            return;
        }

        if (ocppMessage instanceof OcppCallMessage call) {
            handleCall(session, message, call);
            return;
        }

        if (ocppMessage instanceof OcppCallResultMessage result) {
            handleCallResult(session, message, result);
            return;
        }

        if (ocppMessage instanceof OcppCallErrorMessage error) {
            handleCallError(session, message, error);
            return;
        }

        throw new IllegalStateException("Unsupported ocpp message: " + message);
    }

    @Override
    public Response send(WebSocketSession session, Request request) {
        if (logger.isDebugEnabled()) {
            logger.debug("Send request, session: {}, request: {}", session.getId(), request);
        }

        String uniqueId = UUID.randomUUID().toString();
        uniqueIdRepository.save(uniqueId, request.action());

        Promise promise = promiseRepository.put(uniqueId, request);

        OcppCallMessage message = new OcppCallMessage(uniqueId, request.action(), request);
        String serialized = ocppJsonWriter.writeJson(message);

        try {
            messageLoggingService.log(session, serialized);
            session.sendMessage(new TextMessage(serialized));
            if (logger.isDebugEnabled()) {
                logger.debug("Send message, session: {}, message: {}", session.getId(), serialized);
            }
        } catch (IOException e) {
            logger.error("Send websocket text message failed.", e);
            promise.getFuture().completeExceptionally(e);
        }

        try {
            return promise.getFuture().get(3000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            promiseRepository.remove(uniqueId);
            throw new PromiseUnfulfilledException("Charge Point unfulfill promise response", e);
        }
    }

    private void handleCall(WebSocketSession session, String message, OcppCallMessage call) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle Call, session: {}, message: {}", session.getId(), message);
        }
        String identity = SessionAttributeHelper.getIdentity(session);
        Request request = call.getPayload();
        Response response = centralSystemService.handle(identity, request);
        OcppCallResultMessage callResult = new OcppCallResultMessage(call.getUniqueId(), response);
        onSuccess(session, callResult);
    }

    private void handleCallResult(WebSocketSession session, String message, OcppCallResultMessage callResult) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle CallResult, session: {}, message: {}", session.getId(), message);
        }

        Optional<Promise> promiseOptional = promiseRepository.get(callResult.getUniqueId());
        if (promiseOptional.isPresent()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Promise found, CompletableFuture handle result response, session: {}, message: {}",
                    session.getId(),
                    message);
            }
            promiseOptional.get().getFuture().complete(callResult.getPayload());
            promiseRepository.remove(callResult.getUniqueId());
        } else {
            logger.warn("Promise not found, uniqueId: {}", callResult.getUniqueId());
        }
    }

    private void handleCallError(WebSocketSession session, String message, OcppCallErrorMessage callError) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle CallError, session: {}, message: {}", session.getId(), message);
        }
        Optional<Promise> promiseOptional = promiseRepository.get(callError.getUniqueId());
        if (promiseOptional.isPresent()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Promise found, CompletableFuture handle error response, session: {}, message: {}",
                    session.getId(),
                    message);
            }
            promiseRepository.remove(callError.getUniqueId());
        } else {
            if (logger.isDebugEnabled()) {
                logger.debug(
                    "Promise not found, CentralSystemOperations handle error response, session: {}, message:" + " {}",
                    session.getId(),
                    message);
            }
        }
    }

    private void onSuccess(WebSocketSession session, OcppCallResultMessage message) {
        String serialized = ocppJsonWriter.writeJson(message);
        if (logger.isDebugEnabled()) {
            logger.info("Send call result, session: {}, message: {}", session.getId(), serialized);
        }
        try {
            messageLoggingService.log(session, serialized);
            session.sendMessage(new TextMessage(serialized));
        } catch (IOException e) {
            logger.error("Send websocket text message failed.", e);
        }
    }

    private void onFailure(WebSocketSession session, OcppCallErrorMessage message) {
        String serialized = ocppJsonWriter.writeJson(message);
        if (logger.isDebugEnabled()) {
            logger.debug("Send call error, session: {}, message: {}", session.getId(), serialized);
        }
        try {
            messageLoggingService.log(session, serialized);
            session.sendMessage(new TextMessage(serialized));
        } catch (IOException e) {
            logger.error("Send websocket text message failed.", e);
        }
    }

}
