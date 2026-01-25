package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.CertificateHashDataType;
import com.cuckooy.ocpp.v20.model.common.datatypes.IdTokenType;
import lombok.Data;

@Data
public class CustomerInformationRequest implements Request {

    private Integer requestId;
    private Boolean report;
    private Boolean clear;
    private String customerIdentifier;
    private IdTokenType idToken;
    private CertificateHashDataType customerCertificate;
}
