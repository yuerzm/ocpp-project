package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.message.OcppMessage;

public interface OcppJsonWriter {

    String writeJson(OcppMessage message);
}
