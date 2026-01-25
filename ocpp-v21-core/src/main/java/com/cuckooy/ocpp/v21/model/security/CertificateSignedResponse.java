package com.cuckooy.ocpp.v21.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateSignedStatusEnumType;
import lombok.Data;

@Data
public class CertificateSignedResponse implements Response {

    private CertificateSignedStatusEnumType status;
    private StatusInfoType statusInfo;
}
