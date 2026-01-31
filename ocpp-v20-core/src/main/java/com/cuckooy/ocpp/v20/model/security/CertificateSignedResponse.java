package com.cuckooy.ocpp.v20.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.CertificateSignedStatusEnumType;
import lombok.Data;

/**
 * The type Certificate signed response.
 */
@Data
public class CertificateSignedResponse implements Response {

    private CertificateSignedStatusEnumType status;
    private StatusInfoType statusInfo;
}
