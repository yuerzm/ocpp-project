package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignCertificateRequest implements Request {
    
    private String csr;

}
