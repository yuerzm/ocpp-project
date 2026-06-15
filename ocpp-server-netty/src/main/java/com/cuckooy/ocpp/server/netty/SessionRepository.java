package com.cuckooy.ocpp.server.netty;

import io.netty.channel.Channel;

import java.util.Optional;

public interface SessionRepository {

    Optional<Channel> get(String identity);

    Channel get(Channel channel);

    void put(Channel channel);

    void remove(Channel channel);

    void remove(String identity);
}
