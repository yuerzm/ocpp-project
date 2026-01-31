package com.cuckooy.ocpp.v16.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * The type Reserve now request.
 */
@Data
@NoArgsConstructor
public class ReserveNowRequest implements Request {

    private Integer connectorId;

    private Instant expiryDate;

    private String idTag;

    private String parentIdTag;

    private Integer reservationId;

    /**
     * Instantiates a new Reserve now request.
     *
     * @param connectorId   the connector id
     * @param expiryDate    the expiry date
     * @param idTag         the id tag
     * @param reservationId the reservation id
     */
    public ReserveNowRequest(Integer connectorId, Instant expiryDate, String idTag, Integer reservationId) {
        this.connectorId = connectorId;
        this.expiryDate = expiryDate;
        this.idTag = idTag;
        this.reservationId = reservationId;
    }

}
