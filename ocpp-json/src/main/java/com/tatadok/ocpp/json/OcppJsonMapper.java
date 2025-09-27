package com.tatadok.ocpp.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.Serial;
import java.util.Locale;
import java.util.TimeZone;

public class OcppJsonMapper extends ObjectMapper {

    @Serial
    private static final long serialVersionUID = 786082789576052026L;

    public OcppJsonMapper(ObjectMapper src) {
        super(src);
        setTimeZone(TimeZone.getTimeZone("UTC"));
        setLocale(Locale.ENGLISH);
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
        setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        registerModule(new JavaTimeModule());
    }
}
