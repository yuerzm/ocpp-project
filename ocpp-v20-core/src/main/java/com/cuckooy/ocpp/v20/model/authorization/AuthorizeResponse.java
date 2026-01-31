package com.cuckooy.ocpp.v20.model.authorization;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.IdTokenInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.AuthorizeCertificateStatusEnumType;
import lombok.Data;

/**
 * The type Authorize response.
 */
@Data
public class AuthorizeResponse implements Response {

    private IdTokenInfoType idTokenInfo;
    private AuthorizeCertificateStatusEnumType certificateStatus;
}
