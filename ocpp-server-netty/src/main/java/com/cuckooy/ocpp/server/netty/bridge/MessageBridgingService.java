package com.cuckooy.ocpp.server.netty.bridge;

import io.netty.channel.Channel;

public interface MessageBridgingService {

    void onMessage(Channel channel, String message);
}
