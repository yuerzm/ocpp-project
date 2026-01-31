package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.CertificateUseEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Install certificate request.
 */
@Data
@NoArgsConstructor
public class InstallCertificateRequest implements Request {

    private CertificateUseEnumType certificateType;
    private String certificate;
}
