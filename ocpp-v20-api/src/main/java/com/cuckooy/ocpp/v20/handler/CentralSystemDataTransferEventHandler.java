package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferResponse;

public interface CentralSystemDataTransferEventHandler {

    DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request);

}

