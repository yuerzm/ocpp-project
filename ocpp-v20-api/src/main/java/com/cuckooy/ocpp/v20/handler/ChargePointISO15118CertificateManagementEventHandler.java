package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.iso15118.DeleteCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.DeleteCertificateResponse;
import com.cuckooy.ocpp.v20.model.iso15118.GetInstalledCertificateIdsRequest;
import com.cuckooy.ocpp.v20.model.iso15118.GetInstalledCertificateIdsResponse;
import com.cuckooy.ocpp.v20.model.iso15118.InstallCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.InstallCertificateResponse;

/**
 * The interface Charge point iso 15118 certificate management event handler.
 */
public interface ChargePointISO15118CertificateManagementEventHandler {

    /**
     * Handle delete certificate delete certificate response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the delete certificate response
     */
    DeleteCertificateResponse handleDeleteCertificate(String identity, DeleteCertificateRequest request);

    /**
     * Handle get installed certificate ids get installed certificate ids response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get installed certificate ids response
     */
    GetInstalledCertificateIdsResponse handleGetInstalledCertificateIds(String identity,
                                                                        GetInstalledCertificateIdsRequest request);

    /**
     * Handle install certificate install certificate response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the install certificate response
     */
    InstallCertificateResponse handleInstallCertificate(String identity, InstallCertificateRequest request);

}

