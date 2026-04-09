package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationResponse;
import com.cuckooy.ocpp.v20.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v20.model.security.SignCertificateResponse;

/**
 * The interface Central system security event handler.
 */
public interface CentralSystemSecurityEventHandler {

    /**
     * Handle sign certificate sign certificate response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the sign certificate response
     */
    SignCertificateResponse handleSignCertificate(String identity, SignCertificateRequest request);

    /**
     * Handle security event notification security event notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the security event notification response
     */
    SecurityEventNotificationResponse handleSecurityEventNotification(String identity,
                                                                      SecurityEventNotificationRequest request);

}

