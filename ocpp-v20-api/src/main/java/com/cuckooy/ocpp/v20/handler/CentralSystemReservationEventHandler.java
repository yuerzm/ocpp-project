package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateRequest;
import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateResponse;

/**
 * The interface Central system reservation event handler.
 */
public interface CentralSystemReservationEventHandler {

    /**
     * Handle reservation status update reservation status update response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the reservation status update response
     */
    ReservationStatusUpdateResponse handleReservationStatusUpdate(String sessionId, String identity,
                                                                  ReservationStatusUpdateRequest request);
}

