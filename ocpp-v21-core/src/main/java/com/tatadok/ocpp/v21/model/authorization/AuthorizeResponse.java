package com.tatadok.ocpp.v21.model.authorization;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.IdTokenInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.AuthorizeCertificateStatusEnumType;
import lombok.Data;

@Data
public class AuthorizeResponse implements Response {

    private IdTokenInfoType idTokenInfo;
    private AuthorizeCertificateStatusEnumType certificateStatus;
}
