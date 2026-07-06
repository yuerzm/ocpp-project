package com.cuckooy.ocpp.server.authentication;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Charge point registry.
 */
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class ChargePointRegistry {

    private String identity;
    private boolean recognized;

    private boolean required;
    private String username;
    private String password;
}
