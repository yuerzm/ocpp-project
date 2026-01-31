package com.cuckooy.ocpp.core.service;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;

/**
 * The interface Central system service.
 */
public interface CentralSystemService {

    /**
     * Handle response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the response
     */
    Response handle(String sessionId, String identity, Request request);

    /**
     * Gets version.
     *
     * @return the version
     */
    OcppVersion getVersion();
}