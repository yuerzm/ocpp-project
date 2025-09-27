package com.tatadok.ocpp.server.provision;

import com.tatadok.ocpp.core.exception.OcppException;
import com.tatadok.ocpp.core.message.OcppCallErrorMessage;
import com.tatadok.ocpp.core.message.OcppCallMessage;
import com.tatadok.ocpp.core.message.OcppCallResultMessage;
import com.tatadok.ocpp.core.message.OcppMessage;
import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.core.message.UniqueIdRepository;
import com.tatadok.ocpp.core.service.CentralSystemService;
import com.tatadok.ocpp.json.OcppJsonParser;
import com.tatadok.ocpp.json.OcppJsonWriter;
import com.tatadok.ocpp.server.ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractServerTransport implements ServerTransport {

    private static final String OCPP_LOGGER = "OCPPLogger";

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Logger ocppLogger = LoggerFactory.getLogger(OCPP_LOGGER);

    private final OcppJsonParser ocppJsonParser;
    private final OcppJsonWriter ocppJsonWriter;
    private final UniqueIdRepository uniqueIdRepository;
    private final CentralSystemService centralSystemService;

    public AbstractServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                   UniqueIdRepository uniqueIdRepository, CentralSystemService centralSystemService) {
        Assert.notNull(ocppJsonParser, "ocppJsonParser cannot be null");
        Assert.notNull(ocppJsonWriter, "ocppJsonWriter cannot be null");
        Assert.notNull(uniqueIdRepository, "uniqueIdActionRetriever cannot be null");
        Assert.notNull(centralSystemService, "centralSystemService cannot be null");
        this.ocppJsonParser = ocppJsonParser;
        this.ocppJsonWriter = ocppJsonWriter;
        this.uniqueIdRepository = uniqueIdRepository;
        this.centralSystemService = centralSystemService;
    }

    @Override
    public void receive(WebSocketSession session, String message) {
        logger.info("Recv message, session: {}, message: {}", session.getId(), message);

        loggerOcppMessage(session, message);

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

        } else if (ocppMessage instanceof OcppCallResultMessage result) {
            handleCallResult(session, message, result);

        } else if (ocppMessage instanceof OcppCallErrorMessage error) {
            handleCallError(session, message, error);

        } else {
            throw new IllegalStateException("Unsupported ocpp message: " + message);
        }
    }

    @Override
    public Response send(WebSocketSession session, Request request) {
        if (logger.isDebugEnabled()) {
            logger.debug("Send request, session: {}, request: {}", session.getId(), request);
        }

        String uniqueId = UUID.randomUUID().toString();
        uniqueIdRepository.save(uniqueId, request.action());

        CompletableFuture<Response> promise = PromiseContextHolder.prepare(uniqueId);

        OcppCallMessage message = new OcppCallMessage(uniqueId, request.action(), request);
        String serialized = ocppJsonWriter.writeJson(message);

        loggerOcppMessage(session, serialized);

        try {
            session.sendMessage(new TextMessage(serialized));
            logger.info("Send message, session: {}, message: {}", session.getId(), serialized);
        } catch (IOException e) {
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

    private void handleCall(WebSocketSession session, String message, OcppCallMessage call) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle Call, session: {}, message: {}", session.getId(), message);
        }
        String identity = session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_IDENTITY).toString();
        Request request = call.getPayload();
        Response response = centralSystemService.handle(session.getId(), identity, request);
        OcppCallResultMessage callResult = new OcppCallResultMessage(call.getUniqueId(), response);
        onSuccess(session, callResult);
    }

    private void handleCallResult(WebSocketSession session, String message, OcppCallResultMessage callResult) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle CallResult, session: {}, message: {}", session.getId(), message);
        }

        Optional<CompletableFuture<Response>> future = PromiseContextHolder.get(callResult.getUniqueId());
        if (future.isPresent()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Promise found, CompletableFuture handle result response, session: {}, message: {}",
                    session.getId(), message);
            }
            future.get().complete(callResult.getPayload());
            PromiseContextHolder.remove(callResult.getUniqueId());
        } else {
            logger.warn("Promise not found, uniqueId: {}", callResult.getUniqueId());
        }
    }

    private void handleCallError(WebSocketSession session, String message, OcppCallErrorMessage callError) {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle CallError, session: {}, message: {}", session.getId(), message);
        }
        Optional<CompletableFuture<Response>> future = PromiseContextHolder.get(callError.getUniqueId());
        if (future.isPresent()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Promise found, CompletableFuture handle error response, session: {}, message: {}",
                    session.getId(), message);
            }
            PromiseContextHolder.remove(callError.getUniqueId());
        } else {
            if (logger.isDebugEnabled()) {
                logger.debug(
                    "Promise not found, CentralSystemOperations handle error response, session: {}, message:" + " {}",
                    session.getId(), message);
            }
        }
    }

    private void onSuccess(WebSocketSession session, OcppCallResultMessage message) {
        String serialized = ocppJsonWriter.writeJson(message);
        logger.info("Send call result, session: {}, message: {}", session.getId(), serialized);
        try {
            loggerOcppMessage(session, serialized);
            session.sendMessage(new TextMessage(serialized));
        } catch (IOException e) {
            logger.error("Send websocket text message failed.", e);
        }
    }

    private void onFailure(WebSocketSession session, OcppCallErrorMessage message) {
        String serialized = ocppJsonWriter.writeJson(message);
        logger.warn("Send call error, session: {}, message: {}", session.getId(), serialized);
        try {
            loggerOcppMessage(session, serialized);
            session.sendMessage(new TextMessage(serialized));
        } catch (IOException e) {
            logger.error("Send websocket text message failed.", e);
        }
    }

    private void loggerOcppMessage(WebSocketSession session, String message) {
        Object identity = session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_IDENTITY);
        Object protocol = session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_PROTOCOL);
        ocppLogger.info("Identity:\t{},\nSession:\t{},\nEndpoint:\t{},\nProtocol:\t{},\nMessage:\t{}", identity,
            session.getId(), session.getUri(), protocol, message);
    }
}
