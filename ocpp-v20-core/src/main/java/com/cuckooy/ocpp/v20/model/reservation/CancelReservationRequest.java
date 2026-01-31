package com.cuckooy.ocpp.v20.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Cancel reservation request.
 */
@Data
public class CancelReservationRequest implements Request {

    private Integer reservationId;
}
