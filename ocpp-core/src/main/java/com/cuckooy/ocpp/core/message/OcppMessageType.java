package com.cuckooy.ocpp.core.message;

import lombok.Getter;

@Getter
public enum OcppMessageType {

    CALL(2),
    CALL_RESULT(3),
    CALL_ERROR(4);

    private final int code;

    OcppMessageType(int code) {
        this.code = code;
    }
}
