package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.message.OcppMessage;

public interface OcppJsonParser {

    OcppMessage readJson(String message);

}
