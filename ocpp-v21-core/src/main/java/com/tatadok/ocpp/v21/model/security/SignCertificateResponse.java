package com.tatadok.ocpp.v21.model.security;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

@Data
public class SignCertificateResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;

}
