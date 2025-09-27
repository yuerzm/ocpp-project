package com.tatadok.ocpp.core.exception;

import lombok.Getter;

import java.io.Serial;
import java.util.Objects;

@Getter
public class OcppException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -107646464990592344L;

    private String uniqueId;
    private MessageErrorCode code;
    private String description;
    private Object details;

    protected OcppException(String message, String uniqueId, MessageErrorCode code, String description,
                            Object details) {
        super(message);
        this.uniqueId = uniqueId;
        this.code = code;
        this.description = description;
        this.details = Objects.nonNull(details) ? details : new Object();
    }

    protected OcppException(String message, String uniqueId, MessageErrorCode code, String description, Object details,
                            Throwable throwable) {
        super(message, throwable);
        this.uniqueId = uniqueId;
        this.code = code;
        this.description = description;
        this.details = Objects.nonNull(details) ? details : new Object();
    }


}
