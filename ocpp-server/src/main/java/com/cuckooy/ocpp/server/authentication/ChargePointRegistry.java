package com.cuckooy.ocpp.server.authentication;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChargePointRegistry {

    private String identity;
    private boolean recognized;

    private boolean required;
    private String username;
    private String password;
}
