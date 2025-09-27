package com.tatadok.ocpp.v21.model.remote;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.EVSEType;
import com.tatadok.ocpp.v21.model.common.enumerations.MessageTriggerEnumType;
import lombok.Data;

@Data
public class TriggerMessageRequest implements Request {

    private MessageTriggerEnumType requestedMessage;
    private EVSEType evse;
}
