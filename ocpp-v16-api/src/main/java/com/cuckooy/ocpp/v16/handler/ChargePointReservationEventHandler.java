package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowResponse;

/**
 * The interface Charge point reservation event handler.
 */
public interface ChargePointReservationEventHandler {

    /**
     * Handle reserve now reserve now response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the reserve now response
     */
    ReserveNowResponse handleReserveNow(String identity, ReserveNowRequest request);

    /**
     * Handle cancel reservation cancel reservation response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the cancel reservation response
     */
    CancelReservationResponse handleCancelReservation(String identity, CancelReservationRequest request);
}
