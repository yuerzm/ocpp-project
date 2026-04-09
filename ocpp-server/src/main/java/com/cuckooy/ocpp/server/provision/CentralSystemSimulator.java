package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;

/**
 * The interface Central system simulator.
 */
public interface CentralSystemSimulator {

    /**
     * Handle response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the response
     */
    Response handle(String identity, Request request);
}
