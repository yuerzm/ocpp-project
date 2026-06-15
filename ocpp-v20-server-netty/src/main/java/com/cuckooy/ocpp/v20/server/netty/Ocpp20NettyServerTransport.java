package com.cuckooy.ocpp.v20.server.netty;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.json.OcppJsonParser;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.netty.AbstractNettyServerTransport;
import com.cuckooy.ocpp.server.netty.bridge.MessageBridgingService;
import com.cuckooy.ocpp.v20.json.Ocpp20JsonParser;
import com.cuckooy.ocpp.v20.operations.Ocpp20CentralSystemService;

/**
 * OCPP 2.0.1 server transport implementation using Netty.
 */
public class Ocpp20NettyServerTransport extends AbstractNettyServerTransport {

    public Ocpp20NettyServerTransport(Ocpp20JsonParser ocpp20JsonParser, OcppJsonWriter ocppJsonWriter,
                                     UniqueIdRepository uniqueIdRepository,
                                     Ocpp20CentralSystemService ocpp20CentralSystemService) {
        super(ocpp20JsonParser, ocppJsonWriter, uniqueIdRepository, ocpp20CentralSystemService);
    }

    public Ocpp20NettyServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                     UniqueIdRepository uniqueIdRepository, CentralSystemService centralSystemService,
                                     MessageBridgingService messageBridgingService) {
        super(ocppJsonParser, ocppJsonWriter, uniqueIdRepository, centralSystemService, messageBridgingService);
    }
}
