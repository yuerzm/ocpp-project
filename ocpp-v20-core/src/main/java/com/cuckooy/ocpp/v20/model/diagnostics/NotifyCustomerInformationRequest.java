package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

import java.time.Instant;

@Data
public class NotifyCustomerInformationRequest implements Request {

    private String data;
    private Boolean tbc;
    private Integer seqNo;
    private Instant generatedAt;
    private Integer requestId;
}
