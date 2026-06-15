package com.cuckooy.ocpp.server.netty.authentication;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ChargePointAuthenticateResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String identity;
    private boolean recognized;

    private boolean required;
    private String username;
    private String password;
}
