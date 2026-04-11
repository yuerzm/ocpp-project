package com.cuckooy.ocpp.server.authentication;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * The type Charge point authenticate request.
 */
@Data
public class ChargePointAuthenticateRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String identity;

    /**
     * Instantiates a new Charge point authenticate request.
     *
     * @param identity the identity
     */
    public ChargePointAuthenticateRequest(String identity) {
        this.identity = identity;
    }
}
