package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointISO15118CertificateManagementEventHandler;
import com.tatadok.ocpp.v20.model.iso15118.DeleteCertificateRequest;
import com.tatadok.ocpp.v20.model.iso15118.DeleteCertificateResponse;
import com.tatadok.ocpp.v20.model.iso15118.GetInstalledCertificateIdsRequest;
import com.tatadok.ocpp.v20.model.iso15118.GetInstalledCertificateIdsResponse;
import com.tatadok.ocpp.v20.model.iso15118.InstallCertificateRequest;
import com.tatadok.ocpp.v20.model.iso15118.InstallCertificateResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointISO15118CertificateManagementEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointISO15118CertificateManagementEventHandler {

    public ChargePointISO15118CertificateManagementEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public DeleteCertificateResponse handleDeleteCertificate(String sessionId, String identity,
                                                             DeleteCertificateRequest request) {
        return (DeleteCertificateResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String sessionId, String identity,
                                                                               GetInstalledCertificateIdsRequest request) {
        return (GetInstalledCertificateIdsResponse) invoke(sessionId, identity, request);
    }

    @Override
    public InstallCertificateResponse handleInstallCertificate(String sessionId, String identity,
                                                               InstallCertificateRequest request) {
        return (InstallCertificateResponse) invoke(sessionId, identity, request);
    }
}
