package com.tatadok.ocpp.json;

import com.tatadok.ocpp.core.message.OcppMessage;

public interface OcppJsonWriter {

    String writeJson(OcppMessage message);
}
