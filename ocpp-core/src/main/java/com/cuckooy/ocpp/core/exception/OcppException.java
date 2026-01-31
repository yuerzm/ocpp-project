package com.cuckooy.ocpp.core.exception;

import lombok.Getter;

import java.io.Serial;
import java.util.Objects;

/**
 * The type Ocpp exception.
 */
@Getter
public class OcppException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private String uniqueId;
    private MessageErrorCode code;
    private String description;
    private Object details;

    /**
     * Instantiates a new Ocpp exception.
     *
     * @param message     the message
     * @param uniqueId    the unique id
     * @param code        the code
     * @param description the description
     * @param details     the details
     */
    protected OcppException(String message, String uniqueId, MessageErrorCode code, String description,
                            Object details) {
        super(message);
        this.uniqueId = uniqueId;
        this.code = code;
        this.description = description;
        this.details = Objects.nonNull(details) ? details : new Object();
    }

    /**
     * Instantiates a new Ocpp exception.
     *
     * @param message     the message
     * @param uniqueId    the unique id
     * @param code        the code
     * @param description the description
     * @param details     the details
     * @param throwable   the throwable
     */
    protected OcppException(String message, String uniqueId, MessageErrorCode code, String description, Object details,
                            Throwable throwable) {
        super(message, throwable);
        this.uniqueId = uniqueId;
        this.code = code;
        this.description = description;
        this.details = Objects.nonNull(details) ? details : new Object();
    }


}
