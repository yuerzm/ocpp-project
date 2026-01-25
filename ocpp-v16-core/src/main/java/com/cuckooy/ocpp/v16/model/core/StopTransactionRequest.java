package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class StopTransactionRequest implements Request {

    private String idTag;

    private Integer meterStop;

    private ZonedDateTime timestamp;

    private Integer transactionId;

    private Reason reason;

    private List<MeterValue> transactionData;

}
