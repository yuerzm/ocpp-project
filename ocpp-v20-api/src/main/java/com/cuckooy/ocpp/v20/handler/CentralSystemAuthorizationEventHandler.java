package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.authorization.AuthorizeRequest;
import com.cuckooy.ocpp.v20.model.authorization.AuthorizeResponse;

public interface CentralSystemAuthorizationEventHandler {

    AuthorizeResponse handleAuthorize(String sessionId, String identity, AuthorizeRequest request);

}

