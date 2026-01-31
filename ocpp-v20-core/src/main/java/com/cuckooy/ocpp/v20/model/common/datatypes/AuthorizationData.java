package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

/**
 * The type Authorization data.
 */
@Data
public class AuthorizationData {

    private IdTokenType idToken;
    private IdTokenInfoType idTokenInfo;
}