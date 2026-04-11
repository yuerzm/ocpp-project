package com.cuckooy.ocpp.core.message;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * The type Ocpp call message.
 */
@Data
@Setter(AccessLevel.PROTECTED)
public class OcppCallMessage extends OcppMessage {

    private String action;

    private Request payload;

    /**
     * Instantiates a new Ocpp call message.
     *
     * @param uniqueId the unique id
     * @param action   the action
     * @param payload  the payload
     */
    public OcppCallMessage(String uniqueId, String action, Request payload) {
        super(OcppMessageType.CALL, uniqueId);
        this.action = action;
        this.payload = payload;
    }
}