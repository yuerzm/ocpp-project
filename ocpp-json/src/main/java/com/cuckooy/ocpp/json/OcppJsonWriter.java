package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.message.OcppMessage;

/**
 * The interface Ocpp json writer.
 */
public interface OcppJsonWriter {

    /**
     * Write json string.
     *
     * @param message the message
     * @return the string
     */
    String writeJson(OcppMessage message);
}
