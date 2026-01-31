package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

/**
 * The type Stop transaction request.
 */
@Data
@NoArgsConstructor
public class StopTransactionRequest implements Request {

    private String idTag;

    private Integer meterStop;

    private Instant timestamp;

    private Integer transactionId;

    private Reason reason;

    private List<MeterValue> transactionData;

}
