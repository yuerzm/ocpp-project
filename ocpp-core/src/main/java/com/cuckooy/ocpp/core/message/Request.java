package com.cuckooy.ocpp.core.message;

/**
 * The interface Request.
 */
public interface Request {

    /**
     * Action string.
     *
     * @return the string
     */
    default String action() {
        return this.getClass().getSimpleName().replaceAll("Request$", "");
    }

}
