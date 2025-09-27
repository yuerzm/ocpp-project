package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v16.model.security.types.CertificateSignedStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CertificateSignedResponse implements Response {

    private CertificateSignedStatusEnumType status;

}
