package com.tatadok.ocpp.v20.model.security;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.CertificateSigningUseEnumType;
import lombok.Data;

@Data
public class CertificateSignedRequest implements Request {

    private String certificateChain;
    private CertificateSigningUseEnumType certificateType;
}
