package com.cuckooy.ocpp.v20.server;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.provision.AbstractServerTransport;
import com.cuckooy.ocpp.v20.json.Ocpp20JsonParser;
import com.cuckooy.ocpp.v20.operations.Ocpp20CentralSystemService;

public class Ocpp20ServerTransport extends AbstractServerTransport {

    public Ocpp20ServerTransport(Ocpp20JsonParser ocpp20JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository,
                                 Ocpp20CentralSystemService ocpp20CentralSystemService) {
        super(ocpp20JsonParser, ocppJsonWriter, uniqueIdRepository, ocpp20CentralSystemService);
    }
}
