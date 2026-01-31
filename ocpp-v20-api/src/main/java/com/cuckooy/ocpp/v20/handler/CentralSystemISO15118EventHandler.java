package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateResponse;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusRequest;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusResponse;

/**
 * The interface Central system iso 15118 event handler.
 */
public interface CentralSystemISO15118EventHandler {

    /**
     * Handle get 15118 ev certificate get 15118 ev certificate response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get 15118 ev certificate response
     */
    Get15118EVCertificateResponse handleGet15118EVCertificate(String sessionId, String identity,
                                                              Get15118EVCertificateRequest request);

    /**
     * Handle get certificate status get certificate status response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get certificate status response
     */
    GetCertificateStatusResponse handleGetCertificateStatus(String sessionId, String identity,
                                                            GetCertificateStatusRequest request);
}

