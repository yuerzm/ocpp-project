package com.cuckooy.ocpp.json;

import com.networknt.schema.Error;
import tools.jackson.databind.JsonNode;

import java.util.List;

/**
 * The interface Ocpp json validator.
 */
public interface OcppJsonValidator {

    /**
     * Validate list.
     *
     * @param action  the action
     * @param message the message
     * @return the list
     */
    List<Error> validate(String action, JsonNode message);
}
