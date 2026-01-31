package com.cuckooy.ocpp.core.message;

import lombok.Getter;

/**
 * The enum Ocpp message type.
 */
@Getter
public enum OcppMessageType {

    /**
     * Call ocpp message type.
     */
    CALL(2),
    /**
     * Call result ocpp message type.
     */
    CALL_RESULT(3),
    /**
     * Call error ocpp message type.
     */
    CALL_ERROR(4);

    private final int code;

    OcppMessageType(int code) {
        this.code = code;
    }
}
