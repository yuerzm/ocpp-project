package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.iso15118.DeleteCertificateRequest;
import com.tatadok.ocpp.v20.model.iso15118.DeleteCertificateResponse;
import com.tatadok.ocpp.v20.model.iso15118.GetInstalledCertificateIdsRequest;
import com.tatadok.ocpp.v20.model.iso15118.GetInstalledCertificateIdsResponse;
import com.tatadok.ocpp.v20.model.iso15118.InstallCertificateRequest;
import com.tatadok.ocpp.v20.model.iso15118.InstallCertificateResponse;

public interface ChargePointISO15118CertificateManagementEventHandler {

    DeleteCertificateResponse handleDeleteCertificate(String sessionId, String identity,
                                                      DeleteCertificateRequest request);

    GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String sessionId, String identity,
                                                                        GetInstalledCertificateIdsRequest request);

    InstallCertificateResponse handleInstallCertificate(String sessionId, String identity,
                                                        InstallCertificateRequest request);

}

