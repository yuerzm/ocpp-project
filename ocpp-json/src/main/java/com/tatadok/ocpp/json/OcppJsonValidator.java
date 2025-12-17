package com.tatadok.ocpp.json;

import com.networknt.schema.Error;
import tools.jackson.databind.JsonNode;

import java.util.List;

public interface OcppJsonValidator {

    List<Error> validate(String action, JsonNode message);
}
