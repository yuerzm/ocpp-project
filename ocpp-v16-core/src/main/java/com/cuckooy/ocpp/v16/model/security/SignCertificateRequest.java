package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Sign certificate request.
 */
@Data
@NoArgsConstructor
public class SignCertificateRequest implements Request {

    private String csr;

}
