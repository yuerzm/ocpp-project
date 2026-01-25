package com.cuckooy.ocpp.core.message;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.PROTECTED)
public class OcppCallMessage extends OcppMessage {

    private String action;

    private Request payload;

    public OcppCallMessage(String uniqueId, Request payload) {
        super(OcppMessageType.CALL, uniqueId);
        this.action = payload.getClass().getSimpleName().replace("Request", "");
        this.payload = payload;
    }

    public OcppCallMessage(String uniqueId, String action, Request payload) {
        super(OcppMessageType.CALL, uniqueId);
        this.action = action;
        this.payload = payload;
    }
}