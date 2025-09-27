package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.tatadok.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.tatadok.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.tatadok.ocpp.v20.model.remote.RequestStopTransactionResponse;

public interface CentralSystemRemoteEventHandler {

    RequestStartTransactionResponse handleRequestStartTransaction(String sessionId, String identity,
                                                                  RequestStartTransactionRequest request);

    RequestStopTransactionResponse handleRequestStopTransaction(String sessionId, String identity,
                                                                RequestStopTransactionRequest request);

}

