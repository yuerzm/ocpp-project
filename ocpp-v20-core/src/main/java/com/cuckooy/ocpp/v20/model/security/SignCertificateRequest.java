package com.cuckooy.ocpp.v20.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.CertificateSigningUseEnumType;
import lombok.Data;

@Data
public class SignCertificateRequest implements Request {

    private String csr;
    private CertificateSigningUseEnumType certificateType;
}
