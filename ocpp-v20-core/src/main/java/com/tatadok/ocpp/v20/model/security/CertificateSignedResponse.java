package com.tatadok.ocpp.v20.model.security;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.CertificateSignedStatusEnumType;
import lombok.Data;

@Data
public class CertificateSignedResponse implements Response {

    private CertificateSignedStatusEnumType status;
    private StatusInfoType statusInfo;
}
