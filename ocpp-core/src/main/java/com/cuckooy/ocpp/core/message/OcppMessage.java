package com.cuckooy.ocpp.core.message;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * The type Ocpp message.
 */
@Data
@Setter(AccessLevel.PROTECTED)
public abstract class OcppMessage {

    /**
     * The constant INDEX_MESSAGE_TYPE_ID.
     */
    public static final int INDEX_MESSAGE_TYPE_ID = 0;
    /**
     * The constant INDEX_MESSAGE_UNIQUE_ID.
     */
    public static final int INDEX_MESSAGE_UNIQUE_ID = 1;

    /**
     * The constant INDEX_CALL_ACTION.
     */
    public static final int INDEX_CALL_ACTION = 2;
    /**
     * The constant INDEX_CALL_PAYLOAD.
     */
    public static final int INDEX_CALL_PAYLOAD = 3;

    /**
     * The constant INDEX_RESULT_PAYLOAD.
     */
    public static final int INDEX_RESULT_PAYLOAD = 2;

    /**
     * The constant INDEX_ERROR_CODE.
     */
    public static final int INDEX_ERROR_CODE = 2;
    /**
     * The constant INDEX_ERROR_DESCRIPTION.
     */
    public static final int INDEX_ERROR_DESCRIPTION = 3;
    /**
     * The constant INDEX_ERROR_DETAILS.
     */
    public static final int INDEX_ERROR_DETAILS = 4;

    private OcppMessageType messageType;
    private String uniqueId;

    /**
     * Instantiates a new Ocpp message.
     */
    protected OcppMessage() {
    }

    /**
     * Instantiates a new Ocpp message.
     *
     * @param messageType the message type
     * @param uniqueId    the unique id
     */
    public OcppMessage(OcppMessageType messageType, String uniqueId) {
        this.messageType = messageType;
        this.uniqueId = uniqueId;
    }
}
