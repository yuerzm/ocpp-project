package com.tatadok.ocpp.v21.model.reservation;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class CancelReservationRequest implements Request {

    private Integer reservationId;
}
