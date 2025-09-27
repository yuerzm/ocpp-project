package com.tatadok.ocpp.core.message;

public interface Request {

    default String action() {
        return this.getClass().getSimpleName().replaceAll("Request$", "");
    }

}
