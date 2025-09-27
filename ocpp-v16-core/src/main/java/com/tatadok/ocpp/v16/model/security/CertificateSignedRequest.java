package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CertificateSignedRequest implements Request {

    private String certificateChain;

}
