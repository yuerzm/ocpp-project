package com.tatadok.ocpp.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.ValidationMessage;

import java.util.List;

public interface OcppJsonValidator {

    List<ValidationMessage> validate(String action, JsonNode message);
}
