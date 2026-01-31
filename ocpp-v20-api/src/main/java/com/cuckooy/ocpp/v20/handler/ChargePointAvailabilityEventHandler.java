package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityResponse;

/**
 * The interface Charge point availability event handler.
 */
public interface ChargePointAvailabilityEventHandler {

    /**
     * Handle change availability change availability response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the change availability response
     */
    ChangeAvailabilityResponse handleChangeAvailability(String sessionId, String identity,
                                                        ChangeAvailabilityRequest request);
}

