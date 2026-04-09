package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedResponse;

/**
 * The interface Charge point security event handler.
 */
public interface ChargePointSecurityEventHandler {

    /**
     * Handle certificate signed certificate signed response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the certificate signed response
     */
    CertificateSignedResponse handleCertificateSigned(String identity, CertificateSignedRequest request);
}

