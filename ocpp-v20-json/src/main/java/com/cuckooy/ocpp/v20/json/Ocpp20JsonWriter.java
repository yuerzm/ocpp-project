package com.cuckooy.ocpp.v20.json;

import com.cuckooy.ocpp.json.OcppJsonWriterImpl;

/**
 * The type Ocpp 20 json writer.
 */
public class Ocpp20JsonWriter extends OcppJsonWriterImpl {

    /**
     * Instantiates a new Ocpp 20 json writer.
     *
     * @param ocpp20JsonMapper the ocpp 20 json mapper
     */
    public Ocpp20JsonWriter(Ocpp20JsonMapper ocpp20JsonMapper) {
        super(ocpp20JsonMapper);
    }
}
