package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v20.handler.ChargePointRemoteControlEventHandler;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.TriggerMessageRequest;
import com.cuckooy.ocpp.v20.model.remote.TriggerMessageResponse;
import com.cuckooy.ocpp.v20.model.remote.UnlockConnectorRequest;
import com.cuckooy.ocpp.v20.model.remote.UnlockConnectorResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointRemoteControlEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointRemoteControlEventHandler {

    public ChargePointRemoteControlEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public RequestStartTransactionResponse handleRequestStartTransaction(String sessionId, String identity,
                                                                         RequestStartTransactionRequest request) {
        return (RequestStartTransactionResponse) invoke(sessionId, identity, request);
    }

    @Override
    public RequestStopTransactionResponse handleRequestStopTransaction(String sessionId, String identity,
                                                                       RequestStopTransactionRequest request) {
        return (RequestStopTransactionResponse) invoke(sessionId, identity, request);
    }

    @Override
    public TriggerMessageResponse handleTriggerMessage(String sessionId, String identity,
                                                       TriggerMessageRequest request) {
        return (TriggerMessageResponse) invoke(sessionId, identity, request);
    }

    @Override
    public UnlockConnectorResponse handleUnlockConnector(String sessionId, String identity,
                                                         UnlockConnectorRequest request) {
        return (UnlockConnectorResponse) invoke(sessionId, identity, request);
    }
}
