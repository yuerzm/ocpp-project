package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.reservation.ReservationStatusUpdateRequest;
import com.tatadok.ocpp.v20.model.reservation.ReservationStatusUpdateResponse;

public interface CentralSystemReservationEventHandler {

    ReservationStatusUpdateResponse handleReservationStatusUpdate(String sessionId, String identity,
                                                                  ReservationStatusUpdateRequest request);
}

