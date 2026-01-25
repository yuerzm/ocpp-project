package com.cuckooy.ocpp.v21.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class CancelReservationRequest implements Request {

    private Integer reservationId;
}
