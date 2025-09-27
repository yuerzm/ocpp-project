package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.security.CertificateSignedRequest;
import com.tatadok.ocpp.v20.model.security.CertificateSignedResponse;

public interface ChargePointSecurityEventHandler {

    CertificateSignedResponse handleCertificateSigned(String sessionId, String identity,
                                                      CertificateSignedRequest request);
}

