package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointSecurityEventHandler;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedResponse;

public class ChargePointSecurityEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointSecurityEventHandler {
    public ChargePointSecurityEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public CertificateSignedResponse handleCertificateSigned(String identity, CertificateSignedRequest request) { return (CertificateSignedResponse) invoke(identity, request); }
}
