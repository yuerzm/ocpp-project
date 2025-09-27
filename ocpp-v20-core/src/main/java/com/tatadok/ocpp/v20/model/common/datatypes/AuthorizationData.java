package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class AuthorizationData {

    private IdTokenType idToken;
    private IdTokenInfoType idTokenInfo;
}