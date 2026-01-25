package com.cuckooy.ocpp.core.message;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.PROTECTED)
public abstract class OcppMessage {

    public static final int INDEX_MESSAGE_TYPE_ID = 0;
    public static final int INDEX_MESSAGE_UNIQUE_ID = 1;

    public static final int INDEX_CALL_ACTION = 2;
    public static final int INDEX_CALL_PAYLOAD = 3;

    public static final int INDEX_RESULT_PAYLOAD = 2;

    public static final int INDEX_ERROR_CODE = 2;
    public static final int INDEX_ERROR_DESCRIPTION = 3;
    public static final int INDEX_ERROR_DETAILS = 4;

    private OcppMessageType messageType;
    private String uniqueId;

    protected OcppMessage() {
    }

    public OcppMessage(OcppMessageType messageType, String uniqueId) {
        this.messageType = messageType;
        this.uniqueId = uniqueId;
    }
}
