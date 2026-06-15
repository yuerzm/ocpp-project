package com.cuckooy.ocpp.v16.server.netty;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.json.OcppJsonParser;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.server.netty.AbstractNettyServerTransport;
import com.cuckooy.ocpp.server.netty.bridge.MessageBridgingService;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonParser;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;

/**
 * OCPP 1.6 server transport implementation using Netty.
 */
public class Ocpp16NettyServerTransport extends AbstractNettyServerTransport {

    public Ocpp16NettyServerTransport(Ocpp16JsonParser ocpp16JsonParser, OcppJsonWriter ocppJsonWriter,
                                     UniqueIdRepository uniqueIdRepository,
                                     Ocpp16CentralSystemService ocpp16CentralSystemService) {
        super(ocpp16JsonParser, ocppJsonWriter, uniqueIdRepository, ocpp16CentralSystemService);
    }

    public Ocpp16NettyServerTransport(OcppJsonParser ocppJsonParser, OcppJsonWriter ocppJsonWriter,
                                     UniqueIdRepository uniqueIdRepository, CentralSystemService centralSystemService,
                                     MessageBridgingService messageBridgingService) {
        super(ocppJsonParser, ocppJsonWriter, uniqueIdRepository, centralSystemService, messageBridgingService);
    }
}
