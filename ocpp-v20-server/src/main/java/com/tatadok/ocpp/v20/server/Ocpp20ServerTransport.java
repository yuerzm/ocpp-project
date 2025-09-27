package com.tatadok.ocpp.v20.server;

import com.tatadok.ocpp.core.message.UniqueIdRepository;
import com.tatadok.ocpp.core.service.CentralSystemService;
import com.tatadok.ocpp.json.OcppJsonWriter;
import com.tatadok.ocpp.server.provision.AbstractServerTransport;
import com.tatadok.ocpp.v20.json.Ocpp20JsonParser;

public class Ocpp20ServerTransport extends AbstractServerTransport {

    public Ocpp20ServerTransport(Ocpp20JsonParser ocpp20JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository, CentralSystemService centralSystemService) {
        super(ocpp20JsonParser, ocppJsonWriter, uniqueIdRepository, centralSystemService);
    }
}
