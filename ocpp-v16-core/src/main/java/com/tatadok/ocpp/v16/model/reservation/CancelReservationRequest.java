package com.tatadok.ocpp.v16.model.reservation;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CancelReservationRequest implements Request {

    private Integer reservationId;

    public CancelReservationRequest(Integer reservationId) {
        this.reservationId = reservationId;
    }


}
