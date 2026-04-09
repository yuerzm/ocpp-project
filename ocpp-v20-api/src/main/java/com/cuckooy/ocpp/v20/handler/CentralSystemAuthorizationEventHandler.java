package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.authorization.AuthorizeRequest;
import com.cuckooy.ocpp.v20.model.authorization.AuthorizeResponse;

/**
 * The interface Central system authorization event handler.
 */
public interface CentralSystemAuthorizationEventHandler {

    /**
     * Handle authorize authorize response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the authorize response
     */
    AuthorizeResponse handleAuthorize(String identity, AuthorizeRequest request);

}

