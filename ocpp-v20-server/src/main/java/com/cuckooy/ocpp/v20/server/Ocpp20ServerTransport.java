package com.cuckooy.ocpp.v20.server;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.json.OcppJsonParser;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.AbstractServerTransport;
import com.cuckooy.ocpp.server.bridge.MessageBridgingService;
import com.cuckooy.ocpp.v20.json.Ocpp20JsonParser;
import com.cuckooy.ocpp.v20.operations.Ocpp20CentralSystemService;

/**
 * The type Ocpp 20 server transport.
 */
public class Ocpp20ServerTransport extends AbstractServerTransport {

    /**
     * Instantiates a new Ocpp 20 server transport.
     *
     * @param ocpp20JsonParser           the ocpp 20 json parser
     * @param ocppJsonWriter             the ocpp json writer
     * @param uniqueIdRepository         the unique id repository
     * @param ocpp20CentralSystemService the ocpp 20 central system service
     */
    public Ocpp20ServerTransport(Ocpp20JsonParser ocpp20JsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository,
                                 Ocpp20CentralSystemService ocpp20CentralSystemService) {
        super(ocpp20JsonParser, ocppJsonWriter, uniqueIdRepository, ocpp20CentralSystemService);
    }

    /**
     * Instantiates a new Ocpp 20 server transport.
     *
     * @param ocppJsonParser         the ocpp json parser
     * @param ocppJsonWriter         the ocpp json writer
     * @param uniqueIdRepository     the unique id repository
     * @param centralSystemService   the central system service
     * @param messageBridgingService the message bridging service
     */
    public Ocpp20ServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                 UniqueIdRepository uniqueIdRepository, CentralSystemService centralSystemService,
                                 MessageBridgingService messageBridgingService) {
        super(ocppJsonParser, ocppJsonWriter, uniqueIdRepository, centralSystemService, messageBridgingService);
    }
}
