package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v16.model.security.types.CertificateHashDataType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeleteCertificateRequest implements Request {

    private CertificateHashDataType certificateHashData;

}
