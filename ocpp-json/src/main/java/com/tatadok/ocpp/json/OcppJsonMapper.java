package com.tatadok.ocpp.json;

import tools.jackson.core.JsonParser;
import tools.jackson.databind.JsonNode;

public interface OcppJsonMapper {

    public String writeValueAsString(Object value);

    public JsonNode readTree(String content);

    <T> T convertValue(JsonNode node, Class<T> valueType);

    public <T> T readValue(JsonParser p, Class<T> valueType);

    public <T> T readValue(String string, Class<T> valueType);
}
