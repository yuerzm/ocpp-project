package com.cuckooy.ocpp.server.authentication;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * The type Charge point retrieve response.
 */
@Data
public class ChargePointRetrieveResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String identity;
    private boolean recognized;

    private boolean required;
    private String username;
    private String password;

}
