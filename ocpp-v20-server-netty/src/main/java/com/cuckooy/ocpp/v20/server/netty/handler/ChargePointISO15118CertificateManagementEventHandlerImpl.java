package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointISO15118CertificateManagementEventHandler;
import com.cuckooy.ocpp.v20.model.iso15118.*;

public class ChargePointISO15118CertificateManagementEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointISO15118CertificateManagementEventHandler {
    public ChargePointISO15118CertificateManagementEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public DeleteCertificateResponse handleDeleteCertificate(String identity, DeleteCertificateRequest request) { return (DeleteCertificateResponse) invoke(identity, request); }
    @Override public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String identity, GetInstalledCertificateIdsRequest request) { return (GetInstalledCertificateIdsResponse) invoke(identity, request); }
    @Override public InstallCertificateResponse handleInstallCertificate(String identity, InstallCertificateRequest request) { return (InstallCertificateResponse) invoke(identity, request); }
}
