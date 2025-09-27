package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.tatadok.ocpp.v20.model.datatransfer.DataTransferResponse;

public interface ChargePointDataTransferEventHandler {

    DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request);
}
