package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class StartTransactionRequest implements Request {

    private Integer connectorId;

    private String idTag;

    private Integer meterStart;

    private Integer reservationId;

    private Instant timestamp;

}
