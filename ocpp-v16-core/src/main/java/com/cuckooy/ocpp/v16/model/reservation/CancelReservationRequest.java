package com.cuckooy.ocpp.v16.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Cancel reservation request.
 */
@Data
@NoArgsConstructor
public class CancelReservationRequest implements Request {

    private Integer reservationId;

    /**
     * Instantiates a new Cancel reservation request.
     *
     * @param reservationId the reservation id
     */
    public CancelReservationRequest(Integer reservationId) {
        this.reservationId = reservationId;
    }


}
