package com.cuckooy.ocpp.server.session;

public class SessionUnconnectedException extends RuntimeException {

    public SessionUnconnectedException(String message) {
        super(message);
    }
}
