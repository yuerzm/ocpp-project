package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferResponse;

/**
 * The interface Central system data transfer event handler.
 */
public interface CentralSystemDataTransferEventHandler {

    /**
     * Handle data transfer data transfer response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the data transfer response
     */
    DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request);

}

