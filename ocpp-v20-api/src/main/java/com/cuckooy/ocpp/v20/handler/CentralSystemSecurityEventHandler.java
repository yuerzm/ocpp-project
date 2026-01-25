package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationResponse;
import com.cuckooy.ocpp.v20.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v20.model.security.SignCertificateResponse;

public interface CentralSystemSecurityEventHandler {

    SignCertificateResponse handleSignCertificate(String sessionId, String identity, SignCertificateRequest request);

    SecurityEventNotificationResponse handleSecurityEventNotification(String sessionId, String identity,
                                                                      SecurityEventNotificationRequest request);

}

