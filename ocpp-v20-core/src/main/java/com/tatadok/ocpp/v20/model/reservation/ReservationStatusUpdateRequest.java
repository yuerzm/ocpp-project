package com.tatadok.ocpp.v20.model.reservation;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.ReservationUpdateStatusEnumType;
import lombok.Data;

@Data
public class ReservationStatusUpdateRequest implements Request {

    private Integer reservationId;
    private ReservationUpdateStatusEnumType reservationUpdateStatus;
}
