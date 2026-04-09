package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
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

/**
 * The type Charge point remote control event handler.
 */
public class ChargePointRemoteControlEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointRemoteControlEventHandler {

    /**
     * Instantiates a new Charge point remote control event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointRemoteControlEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public RequestStartTransactionResponse handleRequestStartTransaction(String identity,
                                                                         RequestStartTransactionRequest request) {
        return (RequestStartTransactionResponse) invoke(identity, request);
    }

    @Override
    public RequestStopTransactionResponse handleRequestStopTransaction(String identity,
                                                                       RequestStopTransactionRequest request) {
        return (RequestStopTransactionResponse) invoke(identity, request);
    }

    @Override
    public TriggerMessageResponse handleTriggerMessage(String identity, TriggerMessageRequest request) {
        return (TriggerMessageResponse) invoke(identity, request);
    }

    @Override
    public UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request) {
        return (UnlockConnectorResponse) invoke(identity, request);
    }
}
