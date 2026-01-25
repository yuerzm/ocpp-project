package com.cuckooy.ocpp.v20.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.MessageInfoType;
import lombok.Data;

@Data
public class SetDisplayMessageRequest implements Request {

    private MessageInfoType message;
}
