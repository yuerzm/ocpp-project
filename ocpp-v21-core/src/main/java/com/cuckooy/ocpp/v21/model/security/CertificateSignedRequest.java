package com.cuckooy.ocpp.v21.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateSigningUseEnumType;
import lombok.Data;

/**
 * The type Certificate signed request.
 */
@Data
public class CertificateSignedRequest implements Request {

    private String certificateChain;
    private CertificateSigningUseEnumType certificateType;
}
