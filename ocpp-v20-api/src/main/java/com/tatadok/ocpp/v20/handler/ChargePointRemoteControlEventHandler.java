package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.tatadok.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.tatadok.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.tatadok.ocpp.v20.model.remote.RequestStopTransactionResponse;
import com.tatadok.ocpp.v20.model.remote.TriggerMessageRequest;
import com.tatadok.ocpp.v20.model.remote.TriggerMessageResponse;
import com.tatadok.ocpp.v20.model.remote.UnlockConnectorRequest;
import com.tatadok.ocpp.v20.model.remote.UnlockConnectorResponse;

public interface ChargePointRemoteControlEventHandler {

    RequestStartTransactionResponse handleRequestStartTransaction(String sessionId, String identity,
                                                                  RequestStartTransactionRequest request);

    RequestStopTransactionResponse handleRequestStopTransaction(String sessionId, String identity,
                                                                RequestStopTransactionRequest request);

    TriggerMessageResponse handleTriggerMessage(String sessionId, String identity, TriggerMessageRequest request);

    UnlockConnectorResponse handleUnlockConnector(String sessionId, String identity, UnlockConnectorRequest request);

}

