package com.tatadok.ocpp.v16.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tatadok.ocpp.json.OcppJsonMapper;

import java.io.Serial;

public class Ocpp16JsonMapper extends OcppJsonMapper {

    @Serial
    private static final long serialVersionUID = 4561238991513808432L;

    public Ocpp16JsonMapper(ObjectMapper objectMapper) {
        super(objectMapper);
    }
}
