package com.cuckooy.ocpp.v20.model.remote;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.EVSEType;
import com.cuckooy.ocpp.v20.model.common.enumerations.MessageTriggerEnumType;
import lombok.Data;

/**
 * The type Trigger message request.
 */
@Data
public class TriggerMessageRequest implements Request {

    private MessageTriggerEnumType requestedMessage;
    private EVSEType evse;
}
