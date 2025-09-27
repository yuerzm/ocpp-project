package com.tatadok.ocpp.json;

import com.tatadok.ocpp.core.message.OcppMessage;

public interface OcppJsonParser {

    OcppMessage readJson(String message);

}
