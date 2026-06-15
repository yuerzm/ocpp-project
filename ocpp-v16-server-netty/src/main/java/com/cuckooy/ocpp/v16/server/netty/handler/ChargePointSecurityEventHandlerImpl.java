package com.cuckooy.ocpp.v16.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointSecurityEventHandler;
import com.cuckooy.ocpp.v16.model.security.*;

public class ChargePointSecurityEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointSecurityEventHandler {

    public ChargePointSecurityEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) {
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
    public ExtendedTriggerMessageResponse handleExtendedTriggerMessage(String identity, ExtendedTriggerMessageRequest request) {
        return (ExtendedTriggerMessageResponse) invoke(identity, request);
    }

    @Override
    public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String identity, GetInstalledCertificateIdsRequest request) {
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
    public LogStatusNotificationResponse handleLogStatusNotification(String identity, LogStatusNotificationRequest request) {
        return (LogStatusNotificationResponse) invoke(identity, request);
    }

    @Override
    public SecurityEventNotificationResponse handleSecurityEventNotification(String identity, SecurityEventNotificationRequest request) {
        return (SecurityEventNotificationResponse) invoke(identity, request);
    }

    @Override
    public SignCertificateResponse handleSignCertificate(String identity, SignCertificateRequest request) {
        return (SignCertificateResponse) invoke(identity, request);
    }

    @Override
    public SignedFirmwareStatusNotificationResponse handleSignedFirmwareStatusNotification(String identity, SignedFirmwareStatusNotificationRequest request) {
        return (SignedFirmwareStatusNotificationResponse) invoke(identity, request);
    }

    @Override
    public SignedUpdateFirmwareResponse handleSignedUpdateFirmware(String identity, SignedUpdateFirmwareRequest request) {
        return (SignedUpdateFirmwareResponse) invoke(identity, request);
    }
}
