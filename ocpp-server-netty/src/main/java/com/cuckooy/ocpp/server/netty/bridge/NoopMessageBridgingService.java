package com.cuckooy.ocpp.server.netty.bridge;

import io.netty.channel.Channel;

public class NoopMessageBridgingService implements MessageBridgingService {

    @Override
    public void onMessage(Channel channel, String message) {
        // no-op
    }
}
