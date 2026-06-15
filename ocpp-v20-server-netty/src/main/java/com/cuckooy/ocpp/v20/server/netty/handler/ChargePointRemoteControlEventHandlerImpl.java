package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointRemoteControlEventHandler;
import com.cuckooy.ocpp.v20.model.remote.*;

public class ChargePointRemoteControlEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointRemoteControlEventHandler {
    public ChargePointRemoteControlEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public RequestStartTransactionResponse handleRequestStartTransaction(String identity, RequestStartTransactionRequest request) { return (RequestStartTransactionResponse) invoke(identity, request); }
    @Override public RequestStopTransactionResponse handleRequestStopTransaction(String identity, RequestStopTransactionRequest request) { return (RequestStopTransactionResponse) invoke(identity, request); }
    @Override public TriggerMessageResponse handleTriggerMessage(String identity, TriggerMessageRequest request) { return (TriggerMessageResponse) invoke(identity, request); }
    @Override public UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request) { return (UnlockConnectorResponse) invoke(identity, request); }
}
