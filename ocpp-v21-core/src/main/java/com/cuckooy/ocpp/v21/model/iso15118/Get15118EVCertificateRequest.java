package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateActionEnumType;
import lombok.Data;

/**
 * The type Get 15118 ev certificate request.
 */
@Data
public class Get15118EVCertificateRequest implements Request {

    private String iso15118SchemaVersion;
    private CertificateActionEnumType action;
    private String exiRequest;
}
