package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointSecurityEventHandler;
import com.cuckooy.ocpp.v16.model.security.*;
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
        logger.info("Handle CertificateSigned, identity: {}, request: {}", identity, request);
        return (CertificateSignedResponse) invoke(identity, request);
    }

    @Override
    public DeleteCertificateResponse handleDeleteCertificate(String identity, DeleteCertificateRequest request) {
        logger.info("Handle DeleteCertificate, identity: {}, request: {}", identity, request);
        return (DeleteCertificateResponse) invoke(identity, request);
    }

    @Override
    public ExtendedTriggerMessageResponse handleExtendedTriggerMessage(String identity,
                                                                       ExtendedTriggerMessageRequest request) {
        logger.info("Handle ExtendedTriggerMessage, identity: {}, request: {}", identity, request);
        return (ExtendedTriggerMessageResponse) invoke(identity, request);
    }

    @Override
    public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String identity,
                                                                               GetInstalledCertificateIdsRequest request) {
        logger.info("Handle GetInstalledCertificateIds, identity: {}, request: {}", identity, request);
        return (GetInstalledCertificateIdsResponse) invoke(identity, request);
    }

    @Override
    public GetLogResponse handleGetLog(String identity, GetLogRequest request) {
        logger.info("Handle GetLog, identity: {}, request: {}", identity, request);
        return (GetLogResponse) invoke(identity, request);
    }

    @Override
    public InstallCertificateResponse handleInstallCertificate(String identity, InstallCertificateRequest request) {
        logger.info("Handle InstallCertificate, identity: {}, request: {}", identity, request);
        return (InstallCertificateResponse) invoke(identity, request);
    }

    @Override
    public LogStatusNotificationResponse handleLogStatusNotification(String identity,
                                                                     LogStatusNotificationRequest request) {
        logger.info("Handle LogStatusNotification, identity: {}, request: {}", identity, request);
        return (LogStatusNotificationResponse) invoke(identity, request);
    }

    @Override
    public SecurityEventNotificationResponse handleSecurityEventNotification(String identity,
                                                                             SecurityEventNotificationRequest request) {
        logger.info("Handle SecurityEventNotification, identity: {}, request: {}", identity, request);
        return (SecurityEventNotificationResponse) invoke(identity, request);
    }

    @Override
    public SignCertificateResponse handleSignCertificate(String identity, SignCertificateRequest request) {
        logger.info("Handle SignCertificate, identity: {}, request: {}", identity, request);
        return (SignCertificateResponse) invoke(identity, request);
    }

    @Override
    public SignedFirmwareStatusNotificationResponse handleSignedFirmwareStatusNotification(String identity,
                                                                                           SignedFirmwareStatusNotificationRequest request) {
        logger.info("Handle SignedFirmwareStatusNotification, identity: {}, request: {}", identity, request);
        return (SignedFirmwareStatusNotificationResponse) invoke(identity, request);
    }

    @Override
    public SignedUpdateFirmwareResponse handleSignedUpdateFirmware(String identity,
                                                                   SignedUpdateFirmwareRequest request) {
        logger.info("Handle SignedUpdateFirmware, identity: {}, request: {}", identity, request);
        return (SignedUpdateFirmwareResponse) invoke(identity, request);
    }
}