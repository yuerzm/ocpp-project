package com.cuckooy.ocpp.core.message;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * The type Ocpp call result message.
 */
@Data
@Setter(AccessLevel.PROTECTED)
public class OcppCallResultMessage extends OcppMessage {

    private Response payload;

    /**
     * Instantiates a new Ocpp call result message.
     *
     * @param uniqueId the unique id
     * @param payload  the payload
     */
    public OcppCallResultMessage(String uniqueId, Response payload) {
        super(OcppMessageType.CALL_RESULT, uniqueId);
        this.payload = payload;
    }
}