package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedResponse;

public interface ChargePointSecurityEventHandler {

    CertificateSignedResponse handleCertificateSigned(String sessionId, String identity,
                                                      CertificateSignedRequest request);
}

