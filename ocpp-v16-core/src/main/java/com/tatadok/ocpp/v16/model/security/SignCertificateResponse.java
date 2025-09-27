package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v16.model.security.types.GenericStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignCertificateResponse implements Response {

    private GenericStatusEnumType status;

}
