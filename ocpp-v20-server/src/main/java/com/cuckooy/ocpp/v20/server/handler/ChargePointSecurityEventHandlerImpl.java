package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointSecurityEventHandler;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

/**
 * The type Charge point security event handler.
 */
public class ChargePointSecurityEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointSecurityEventHandler {

    /**
     * Instantiates a new Charge point security event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointSecurityEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                               SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public CertificateSignedResponse handleCertificateSigned(String sessionId, String identity,
                                                             CertificateSignedRequest request) {
        return (CertificateSignedResponse) invoke(sessionId, identity, request);
    }
}
