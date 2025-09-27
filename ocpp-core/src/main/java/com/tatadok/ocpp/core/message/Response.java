package com.tatadok.ocpp.core.message;

public interface Response {

    default String action() {
        return this.getClass().getSimpleName().replaceAll("Response$", "");
    }

}
