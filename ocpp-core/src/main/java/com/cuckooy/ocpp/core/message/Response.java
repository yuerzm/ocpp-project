package com.cuckooy.ocpp.core.message;

/**
 * The interface Response.
 */
public interface Response {

    /**
     * Action string.
     *
     * @return the string
     */
    default String action() {
        return this.getClass().getSimpleName().replaceAll("Response$", "");
    }

}
