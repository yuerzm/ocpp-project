package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class AuthorizationData {

    private IdTokenType idToken;
    private IdTokenInfoType idTokenInfo;
}