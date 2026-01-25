package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowResponse;

public interface ChargePointReservationEventHandler {

    ReserveNowResponse handleReserveNow(String sessionId, String identity, ReserveNowRequest request);

    CancelReservationResponse handleCancelReservation(String sessionId, String identity,
                                                      CancelReservationRequest request);
}
