package com.tatadok.ocpp.v20.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tatadok.ocpp.json.OcppJsonMapper;

import java.io.Serial;

public class Ocpp20JsonMapper extends OcppJsonMapper {

    @Serial
    private static final long serialVersionUID = 1L;

    public Ocpp20JsonMapper(ObjectMapper objectMapper) {
        super(objectMapper);
    }
}
