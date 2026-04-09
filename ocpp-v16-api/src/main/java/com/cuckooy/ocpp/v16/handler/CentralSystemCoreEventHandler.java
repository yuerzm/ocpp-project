package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.core.AuthorizeRequest;
import com.cuckooy.ocpp.v16.model.core.AuthorizeResponse;
import com.cuckooy.ocpp.v16.model.core.BootNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.BootNotificationResponse;
import com.cuckooy.ocpp.v16.model.core.DataTransferRequest;
import com.cuckooy.ocpp.v16.model.core.DataTransferResponse;
import com.cuckooy.ocpp.v16.model.core.HeartbeatRequest;
import com.cuckooy.ocpp.v16.model.core.HeartbeatResponse;
import com.cuckooy.ocpp.v16.model.core.MeterValuesRequest;
import com.cuckooy.ocpp.v16.model.core.MeterValuesResponse;
import com.cuckooy.ocpp.v16.model.core.StartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StartTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.core.StopTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StopTransactionResponse;

/**
 * The interface Central system core event handler.
 */
public interface CentralSystemCoreEventHandler {

    /**
     * Handle authorize authorize response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the authorize response
     */
    AuthorizeResponse handleAuthorize(String identity, AuthorizeRequest request);

    /**
     * Handle boot notification boot notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the boot notification response
     */
    BootNotificationResponse handleBootNotification(String identity, BootNotificationRequest request);

    /**
     * Handle data transfer data transfer response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the data transfer response
     */
    DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request);

    /**
     * Handle heartbeat heartbeat response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the heartbeat response
     */
    HeartbeatResponse handleHeartbeat(String identity, HeartbeatRequest request);

    /**
     * Handle meter values meter values response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the meter values response
     */
    MeterValuesResponse handleMeterValues(String identity, MeterValuesRequest request);

    /**
     * Handle status notification status notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the status notification response
     */
    StatusNotificationResponse handleStatusNotification(String identity, StatusNotificationRequest request);

    /**
     * Handle start transaction start transaction response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the start transaction response
     */
    StartTransactionResponse handleStartTransaction(String identity, StartTransactionRequest request);

    /**
     * Handle stop transaction stop transaction response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the stop transaction response
     */
    StopTransactionResponse handleStopTransaction(String identity, StopTransactionRequest request);
}
