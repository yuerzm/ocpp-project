package com.cuckooy.ocpp.server.session;

import org.springframework.web.socket.WebSocketSession;

/**
 * The type Session attribute helper.
 */
public final class SessionAttributeHelper {

    /**
     * The constant CHARGE_POINT_IDENTITY.
     */
    public static final String CHARGE_POINT_IDENTITY = "__CHARGE_POINT_IDENTITY__";
    /**
     * The constant CHARGE_POINT_PROTOCOL.
     */
    public static final String CHARGE_POINT_PROTOCOL = "__CHARGE_POINT_PROTOCOL__";

    /**
     * Gets identity.
     *
     * @param session the session
     * @return the identity
     */
    public static String getIdentity(WebSocketSession session) {
        Object identity = session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_IDENTITY);

        if (identity == null) {
            throw new IllegalStateException("Missing Charge Point identity");
        }

        return identity.toString();
    }

    /**
     * Gets protocol.
     *
     * @param session the session
     * @return the protocol
     */
    public static Object getProtocol(WebSocketSession session) {
        return session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_PROTOCOL);
    }
}
