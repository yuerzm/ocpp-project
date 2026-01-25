package com.cuckooy.ocpp.v20.server;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.provision.AbstractServerTransport;
import com.cuckooy.ocpp.v20.json.Ocpp20JsonParser;

public class Ocpp20ServerTransport extends AbstractServerTransport {

    public Ocpp20ServerTransport(Ocpp20JsonParser ocpp20JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository, CentralSystemService centralSystemService) {
        super(ocpp20JsonParser, ocppJsonWriter, uniqueIdRepository, centralSystemService);
    }
}
