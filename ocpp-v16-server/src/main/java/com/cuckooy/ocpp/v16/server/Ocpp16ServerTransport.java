package com.cuckooy.ocpp.v16.server;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.server.AbstractServerTransport;
import com.cuckooy.ocpp.server.promise.PromiseRepository;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonParser;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonWriter;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;

/**
 * The type Ocpp 16 server transport.
 */
public class Ocpp16ServerTransport extends AbstractServerTransport {

    /**
     * Instantiates a new Ocpp 16 server transport.
     *
     * @param ocpp16JsonParser           the ocpp 16 json parser
     * @param ocpp16JsonWriter           the ocpp 16 json writer
     * @param promiseRepository          the promise repository
     * @param uniqueIdRepository         the unique id repository
     * @param ocpp16CentralSystemService the ocpp 16 central system service
     */
    public Ocpp16ServerTransport(Ocpp16JsonParser ocpp16JsonParser, Ocpp16JsonWriter ocpp16JsonWriter,
                                 PromiseRepository promiseRepository, UniqueIdRepository uniqueIdRepository,
                                 Ocpp16CentralSystemService ocpp16CentralSystemService) {
        super(ocpp16JsonParser, ocpp16JsonWriter, promiseRepository, uniqueIdRepository, ocpp16CentralSystemService);
    }
}
