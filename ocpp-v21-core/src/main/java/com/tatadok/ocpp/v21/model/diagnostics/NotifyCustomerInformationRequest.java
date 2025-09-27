package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class NotifyCustomerInformationRequest implements Request {

    private String data;
    private Boolean tbc;
    private Integer seqNo;
    private ZonedDateTime generatedAt;
    private Integer requestId;
}
