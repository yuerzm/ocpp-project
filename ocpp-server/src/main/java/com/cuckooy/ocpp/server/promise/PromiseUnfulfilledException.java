package com.cuckooy.ocpp.server.promise;

public class PromiseUnfulfilledException extends RuntimeException {
    
    public PromiseUnfulfilledException(String message, Throwable cause) {
        super(message, cause);
    }
}
