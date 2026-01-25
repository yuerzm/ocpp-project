package com.cuckooy.ocpp.v21.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.MessageInfoType;
import lombok.Data;

@Data
public class SetDisplayMessageRequest implements Request {

    private MessageInfoType message;
}
