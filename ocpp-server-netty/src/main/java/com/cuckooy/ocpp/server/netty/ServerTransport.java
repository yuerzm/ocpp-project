package com.cuckooy.ocpp.server.netty;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import io.netty.channel.Channel;

public interface ServerTransport {

    void receive(Channel channel, String message);

    Response send(Channel channel, Request request);
}
