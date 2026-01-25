package com.cuckooy.ocpp.v16.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class ReserveNowRequest implements Request {

    private Integer connectorId;

    private ZonedDateTime expiryDate;

    private String idTag;

    private String parentIdTag;

    private Integer reservationId;

    public ReserveNowRequest(Integer connectorId, ZonedDateTime expiryDate, String idTag, Integer reservationId) {
        this.connectorId = connectorId;
        this.expiryDate = expiryDate;
        this.idTag = idTag;
        this.reservationId = reservationId;
    }

}
