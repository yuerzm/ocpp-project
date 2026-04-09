package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferResponse;

/**
 * The interface Charge point data transfer event handler.
 */
public interface ChargePointDataTransferEventHandler {

    /**
     * Handle data transfer data transfer response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the data transfer response
     */
    DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request);
}
