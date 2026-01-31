package com.cuckooy.ocpp.server.logger;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

/**
 * The type Logger event.
 */
@Getter
@ToString
public class LoggerEvent extends ApplicationEvent implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Object identity;
    private Object protocol;
    private String sessionId;
    private String uniqueId;
    private String action;
    private String message;
    private Instant occurAt;

    /**
     * Instantiates a new Logger event.
     *
     * @param identity  the identity
     * @param protocol  the protocol
     * @param sessionId the session id
     * @param uniqueId  the unique id
     * @param action    the action
     * @param message   the message
     */
    public LoggerEvent(Object identity, Object protocol, String sessionId, String uniqueId, String action,
                       String message) {
        super(identity);
        this.identity = identity;
        this.protocol = protocol;
        this.sessionId = sessionId;
        this.uniqueId = uniqueId;
        this.action = action;
        this.message = message;
        this.occurAt = Instant.now();
    }
}
