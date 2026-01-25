package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateRequest;
import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateResponse;

public interface CentralSystemReservationEventHandler {

    ReservationStatusUpdateResponse handleReservationStatusUpdate(String sessionId, String identity,
                                                                  ReservationStatusUpdateRequest request);
}

