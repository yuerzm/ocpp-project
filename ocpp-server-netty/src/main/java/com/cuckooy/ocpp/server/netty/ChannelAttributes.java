package com.cuckooy.ocpp.server.netty;

import io.netty.util.AttributeKey;

public final class ChannelAttributes {

    public static final AttributeKey<String> CHARGE_POINT_IDENTITY = AttributeKey.valueOf("__identity__");

    public static final AttributeKey<String> CHARGE_POINT_PROTOCOL = AttributeKey.valueOf("__protocol__");

    private ChannelAttributes() {
    }
}
