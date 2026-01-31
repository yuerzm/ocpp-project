package com.cuckooy.ocpp.v21.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.ReservationUpdateStatusEnumType;
import lombok.Data;

/**
 * The type Reservation status update request.
 */
@Data
public class ReservationStatusUpdateRequest implements Request {

    private Integer reservationId;
    private ReservationUpdateStatusEnumType reservationUpdateStatus;
}
