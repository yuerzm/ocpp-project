package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointSecurityEventHandler;
import com.cuckooy.ocpp.v16.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v16.model.security.CertificateSignedResponse;
import com.cuckooy.ocpp.v16.model.security.DeleteCertificateRequest;
import com.cuckooy.ocpp.v16.model.security.DeleteCertificateResponse;
import com.cuckooy.ocpp.v16.model.security.ExtendedTriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.security.ExtendedTriggerMessageResponse;
import com.cuckooy.ocpp.v16.model.security.GetInstalledCertificateIdsRequest;
import com.cuckooy.ocpp.v16.model.security.GetInstalledCertificateIdsResponse;
import com.cuckooy.ocpp.v16.model.security.GetLogRequest;
import com.cuckooy.ocpp.v16.model.security.GetLogResponse;
import com.cuckooy.ocpp.v16.model.security.InstallCertificateRequest;
import com.cuckooy.ocpp.v16.model.security.InstallCertificateResponse;
import com.cuckooy.ocpp.v16.model.security.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.security.LogStatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v16.model.security.SecurityEventNotificationResponse;
import com.cuckooy.ocpp.v16.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v16.model.security.SignCertificateResponse;
import com.cuckooy.ocpp.v16.model.security.SignedFirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.security.SignedFirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.security.SignedUpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.security.SignedUpdateFirmwareResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point security event handler.
 */
public class ChargePointSecurityEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointSecurityEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point security event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointSecurityEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                               SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public CertificateSignedResponse handleCertificateSigned(String identity, CertificateSignedRequest request) {
        return (CertificateSignedResponse) invoke(identity, request);
    }

    @Override
    public DeleteCertificateResponse handleDeleteCertificate(String identity, DeleteCertificateRequest request) {
        return (DeleteCertificateResponse) invoke(identity, request);
    }

    @Override
    public ExtendedTriggerMessageResponse handleExtendedTriggerMessage(String identity,
                                                                       ExtendedTriggerMessageRequest request) {
        return (ExtendedTriggerMessageResponse) invoke(identity, request);
    }

    @Override
    public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String identity,
                                                                               GetInstalledCertificateIdsRequest request) {
        return (GetInstalledCertificateIdsResponse) invoke(identity, request);
    }

    @Override
    public GetLogResponse handleGetLog(String identity, GetLogRequest request) {
        return (GetLogResponse) invoke(identity, request);
    }

    @Override
    public InstallCertificateResponse handleInstallCertificate(String identity, InstallCertificateRequest request) {
        return (InstallCertificateResponse) invoke(identity, request);
    }

    @Override
    public LogStatusNotificationResponse handleLogStatusNotification(String identity,
                                                                     LogStatusNotificationRequest request) {
        return (LogStatusNotificationResponse) invoke(identity, request);
    }

    @Override
    public SecurityEventNotificationResponse handleSecurityEventNotification(String identity,
                                                                             SecurityEventNotificationRequest request) {
        return (SecurityEventNotificationResponse) invoke(identity, request);
    }

    @Override
    public SignCertificateResponse handleSignCertificate(String identity, SignCertificateRequest request) {
        return (SignCertificateResponse) invoke(identity, request);
    }

    @Override
    public SignedFirmwareStatusNotificationResponse handleSignedFirmwareStatusNotification(String identity,
                                                                                           SignedFirmwareStatusNotificationRequest request) {
        return (SignedFirmwareStatusNotificationResponse) invoke(identity, request);
    }

    @Override
    public SignedUpdateFirmwareResponse handleSignedUpdateFirmware(String identity,
                                                                   SignedUpdateFirmwareRequest request) {
        return (SignedUpdateFirmwareResponse) invoke(identity, request);
    }
}