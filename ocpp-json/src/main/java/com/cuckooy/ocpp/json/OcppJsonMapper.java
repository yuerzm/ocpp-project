package com.cuckooy.ocpp.json;

import tools.jackson.core.JsonParser;
import tools.jackson.databind.JsonNode;

/**
 * The interface Ocpp json mapper.
 */
public interface OcppJsonMapper {

    /**
     * Write value as string string.
     *
     * @param value the value
     * @return the string
     */
    public String writeValueAsString(Object value);

    /**
     * Read tree json node.
     *
     * @param content the content
     * @return the json node
     */
    public JsonNode readTree(String content);

    /**
     * Convert value t.
     *
     * @param <T>       the type parameter
     * @param node      the node
     * @param valueType the value type
     * @return the t
     */
    <T> T convertValue(JsonNode node, Class<T> valueType);

    /**
     * Read value t.
     *
     * @param <T>       the type parameter
     * @param p         the p
     * @param valueType the value type
     * @return the t
     */
    public <T> T readValue(JsonParser p, Class<T> valueType);

    /**
     * Read value t.
     *
     * @param <T>       the type parameter
     * @param string    the string
     * @param valueType the value type
     * @return the t
     */
    public <T> T readValue(String string, Class<T> valueType);
}
