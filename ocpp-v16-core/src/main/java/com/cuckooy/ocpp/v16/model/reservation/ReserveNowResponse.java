package com.cuckooy.ocpp.v16.model.reservation;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReserveNowResponse implements Response {

    private ReservationStatus status;

}
