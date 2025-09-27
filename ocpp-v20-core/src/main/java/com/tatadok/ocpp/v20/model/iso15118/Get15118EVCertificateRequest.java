package com.tatadok.ocpp.v20.model.iso15118;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.CertificateActionEnumType;
import lombok.Data;

@Data
public class Get15118EVCertificateRequest implements Request {

    private String iso15118SchemaVersion;
    private CertificateActionEnumType action;
    private String exiRequest;
}
