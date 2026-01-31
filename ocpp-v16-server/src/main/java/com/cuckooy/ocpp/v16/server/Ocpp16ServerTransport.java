package com.cuckooy.ocpp.v16.server;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.AbstractServerTransport;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonParser;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;

/**
 * The type Ocpp 16 server transport.
 */
public class Ocpp16ServerTransport extends AbstractServerTransport {

    /**
     * Instantiates a new Ocpp 16 server transport.
     *
     * @param ocpp16JsonParser           the ocpp 16 json parser
     * @param ocppJsonWriter             the ocpp json writer
     * @param uniqueIdRepository         the unique id repository
     * @param ocpp16CentralSystemService the ocpp 16 central system service
     */
    public Ocpp16ServerTransport(Ocpp16JsonParser ocpp16JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository,
                                 Ocpp16CentralSystemService ocpp16CentralSystemService) {
        super(ocpp16JsonParser, ocppJsonWriter, uniqueIdRepository, ocpp16CentralSystemService);
    }

}
