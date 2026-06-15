package com.cuckooy.ocpp.v16.json;

import com.cuckooy.ocpp.json.OcppJsonWriterImpl;

/**
 * The type Ocpp 16 json parser.
 */
public class Ocpp16JsonWriter extends OcppJsonWriterImpl {

    /**
     * Instantiates a new Ocpp json writer.
     *
     * @param ocpp16JsonMapper the ocpp json mapper
     */
    public Ocpp16JsonWriter(Ocpp16JsonMapper ocpp16JsonMapper) {
        super(ocpp16JsonMapper);
    }
}
