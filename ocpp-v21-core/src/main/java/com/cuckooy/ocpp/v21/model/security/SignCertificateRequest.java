package com.cuckooy.ocpp.v21.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateSigningUseEnumType;
import lombok.Data;

/**
 * The type Sign certificate request.
 */
@Data
public class SignCertificateRequest implements Request {

    private String csr;
    private CertificateSigningUseEnumType certificateType;
}
