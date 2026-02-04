package com.cuckooy.ocpp.server.authentication;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * The type Charge point retrieve request.
 */
@Data
public class ChargePointRetrieveRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String identity;

    /**
     * Instantiates a new Charge point retrieve request.
     *
     * @param identity the identity
     */
    public ChargePointRetrieveRequest(String identity) {
        this.identity = identity;
    }
}
