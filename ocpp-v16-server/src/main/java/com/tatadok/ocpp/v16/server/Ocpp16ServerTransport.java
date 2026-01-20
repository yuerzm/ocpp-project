package com.tatadok.ocpp.v16.server;

import com.tatadok.ocpp.core.message.UniqueIdRepository;
import com.tatadok.ocpp.json.OcppJsonWriter;
import com.tatadok.ocpp.server.provision.AbstractServerTransport;
import com.tatadok.ocpp.v16.json.Ocpp16JsonParser;
import com.tatadok.ocpp.v16.server.operations.Ocpp16CentralSystemServiceImpl;

public class Ocpp16ServerTransport extends AbstractServerTransport {

    public Ocpp16ServerTransport(Ocpp16JsonParser ocpp16JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository,
                                 Ocpp16CentralSystemServiceImpl centralSystemService) {
        super(ocpp16JsonParser, ocppJsonWriter, uniqueIdRepository, centralSystemService);
    }

}
