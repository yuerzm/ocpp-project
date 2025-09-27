package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.security.SecurityEventNotificationRequest;
import com.tatadok.ocpp.v20.model.security.SecurityEventNotificationResponse;
import com.tatadok.ocpp.v20.model.security.SignCertificateRequest;
import com.tatadok.ocpp.v20.model.security.SignCertificateResponse;

public interface CentralSystemSecurityEventHandler {

    SignCertificateResponse handleSignCertificate(String sessionId, String identity, SignCertificateRequest request);

    SecurityEventNotificationResponse handleSecurityEventNotification(String sessionId, String identity,
                                                                      SecurityEventNotificationRequest request);

}

