package com.cuckooy.ocpp.server.netty;

import io.netty.channel.Channel;

public interface SessionEventHandler {

    void connect(Channel channel);

    void disconnect(Channel channel);

    void exception(Channel channel, Throwable throwable);
}
