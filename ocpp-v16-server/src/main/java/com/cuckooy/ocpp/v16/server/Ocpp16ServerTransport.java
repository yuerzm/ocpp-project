package com.cuckooy.ocpp.v16.server;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.AbstractServerTransport;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonParser;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;

public class Ocpp16ServerTransport extends AbstractServerTransport {

    public Ocpp16ServerTransport(Ocpp16JsonParser ocpp16JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository,
                                 Ocpp16CentralSystemService ocpp16CentralSystemService) {
        super(ocpp16JsonParser, ocppJsonWriter, uniqueIdRepository, ocpp16CentralSystemService);
    }

}
