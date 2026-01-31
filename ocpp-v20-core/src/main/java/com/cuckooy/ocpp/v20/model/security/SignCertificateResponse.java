package com.cuckooy.ocpp.v20.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Sign certificate response.
 */
@Data
public class SignCertificateResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;

}
