package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class StartTransactionRequest implements Request {

    private Integer connectorId;

    private String idTag;

    private Integer meterStart;

    private Integer reservationId;

    private ZonedDateTime timestamp;

}
