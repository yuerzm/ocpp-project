package com.cuckooy.ocpp.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

import java.util.Locale;
import java.util.TimeZone;

public class OcppJacksonMapper implements OcppJsonMapper {

    private final JsonMapper jsonMapper;

    public OcppJacksonMapper() {
        jsonMapper = JsonMapper.builder()
            .defaultTimeZone(TimeZone.getTimeZone("UTC"))
            .defaultLocale(Locale.ENGLISH)
            .changeDefaultPropertyInclusion(incl -> incl.withValueInclusion(JsonInclude.Include.NON_NULL))
            .changeDefaultPropertyInclusion(incl -> incl.withContentInclusion(JsonInclude.Include.NON_NULL))
            .build();
    }

    @Override
    public String writeValueAsString(Object value) {
        return jsonMapper.writeValueAsString(value);
    }

    @Override
    public JsonNode readTree(String content) {
        return jsonMapper.readTree(content);
    }

    @Override
    public <T> T convertValue(JsonNode node, Class<T> valueType) {
        return jsonMapper.convertValue(node, valueType);
    }

    @Override
    public <T> T readValue(JsonParser p, Class<T> valueType) {
        return jsonMapper.readValue(p, valueType);
    }

    @Override
    public <T> T readValue(String string, Class<T> valueType) {
        return jsonMapper.readValue(string, valueType);
    }
}
