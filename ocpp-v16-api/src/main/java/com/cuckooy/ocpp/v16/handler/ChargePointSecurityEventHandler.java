package com.cuckooy.ocpp.v16.handler;

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

/**
 * The interface Charge point security event handler.
 */
public interface ChargePointSecurityEventHandler {

    /**
     * Handle certificate signed certificate signed response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the certificate signed response
     */
    CertificateSignedResponse handleCertificateSigned(String identity, CertificateSignedRequest request);

    /**
     * Handle delete certificate delete certificate response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the delete certificate response
     */
    DeleteCertificateResponse handleDeleteCertificate(String identity, DeleteCertificateRequest request);

    /**
     * Handle extended trigger message extended trigger message response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the extended trigger message response
     */
    ExtendedTriggerMessageResponse handleExtendedTriggerMessage(String identity, ExtendedTriggerMessageRequest request);

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
     * Handle get log get log response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get log response
     */
    GetLogResponse handleGetLog(String identity, GetLogRequest request);

    /**
     * Handle install certificate install certificate response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the install certificate response
     */
    InstallCertificateResponse handleInstallCertificate(String identity, InstallCertificateRequest request);

    /**
     * Handle log status notification log status notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the log status notification response
     */
    LogStatusNotificationResponse handleLogStatusNotification(String identity, LogStatusNotificationRequest request);

    /**
     * Handle security event notification security event notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the security event notification response
     */
    SecurityEventNotificationResponse handleSecurityEventNotification(String identity,
                                                                      SecurityEventNotificationRequest request);

    /**
     * Handle sign certificate sign certificate response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the sign certificate response
     */
    SignCertificateResponse handleSignCertificate(String identity, SignCertificateRequest request);

    /**
     * Handle signed firmware status notification signed firmware status notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the signed firmware status notification response
     */
    SignedFirmwareStatusNotificationResponse handleSignedFirmwareStatusNotification(String identity,
                                                                                    SignedFirmwareStatusNotificationRequest request);

    /**
     * Handle signed update firmware signed update firmware response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the signed update firmware response
     */
    SignedUpdateFirmwareResponse handleSignedUpdateFirmware(String identity, SignedUpdateFirmwareRequest request);

}