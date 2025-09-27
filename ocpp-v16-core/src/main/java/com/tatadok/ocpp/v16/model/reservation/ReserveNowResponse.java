package com.tatadok.ocpp.v16.model.reservation;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReserveNowResponse implements Response {

    private ReservationStatus status;

}
