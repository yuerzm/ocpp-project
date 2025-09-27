package com.tatadok.ocpp.core.message;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.PROTECTED)
public class OcppCallResultMessage extends OcppMessage {

    private Response payload;

    public OcppCallResultMessage(String uniqueId, Response payload) {
        super(OcppMessageType.CALL_RESULT, uniqueId);
        this.payload = payload;
    }
}