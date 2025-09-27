package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.reservation.CancelReservationRequest;
import com.tatadok.ocpp.v20.model.reservation.CancelReservationResponse;
import com.tatadok.ocpp.v20.model.reservation.ReserveNowRequest;
import com.tatadok.ocpp.v20.model.reservation.ReserveNowResponse;

public interface ChargePointReservationEventHandler {

    CancelReservationResponse handleCancelReservation(String sessionId, String identity,
                                                      CancelReservationRequest request);

    ReserveNowResponse handleReserveNow(String sessionId, String identity, ReserveNowRequest request);

}

