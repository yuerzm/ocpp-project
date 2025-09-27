package com.tatadok.ocpp.v20.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.CertificateHashDataType;
import com.tatadok.ocpp.v20.model.common.datatypes.IdTokenType;
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
