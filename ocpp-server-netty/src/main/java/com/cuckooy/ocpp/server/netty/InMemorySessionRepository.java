package com.cuckooy.ocpp.server.netty;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemorySessionRepository implements SessionRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Map<String, Channel> sessions = new ConcurrentHashMap<>();

    @Override
    public Optional<Channel> get(String identity) {
        return Optional.ofNullable(sessions.get(identity));
    }

    @Override
    public Channel get(Channel channel) {
        String identity = getIdentity(channel);
        return sessions.get(identity);
    }

    @Override
    public void put(Channel channel) {
        String identity = getIdentity(channel);

        logger.debug("put: {}, {}", identity, channel);

        sessions.compute(identity, (key, oldChannel) -> {
            if (oldChannel != null && oldChannel.isActive()) {
                closeQuietly(oldChannel);
            }
            return channel;
        });
    }

    @Override
    public void remove(Channel channel) {
        String identity = getIdentity(channel);
        Channel removed = sessions.remove(identity);
        if (removed != null && removed.isActive()) {
            closeQuietly(removed);
        }
    }

    @Override
    public void remove(String identity) {
        Channel removed = sessions.remove(identity);
        if (removed != null && removed.isActive()) {
            closeQuietly(removed);
        }
    }

    private void closeQuietly(Channel channel) {
        try {
            channel.close();
        } catch (Exception e) {
            String identity = getIdentity(channel);
            logger.warn("Quietly close channel failed. identity: {}", identity, e);
        }
    }

    private static String getIdentity(Channel channel) {
        String identity = channel.attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
        if (identity == null) {
            throw new IllegalStateException("Missing Charge Point identity");
        }
        return identity;
    }
}
