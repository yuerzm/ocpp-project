package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.message.OcppMessage;

/**
 * The interface Ocpp json parser.
 */
public interface OcppJsonParser {

    /**
     * Read json ocpp message.
     *
     * @param message the message
     * @return the ocpp message
     */
    OcppMessage readJson(String message);

}
