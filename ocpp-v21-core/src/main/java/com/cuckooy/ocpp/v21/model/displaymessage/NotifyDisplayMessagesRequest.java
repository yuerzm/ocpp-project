package com.cuckooy.ocpp.v21.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.MessageInfoType;
import lombok.Data;

import java.util.List;

@Data
public class NotifyDisplayMessagesRequest implements Request {

    private Integer requestId;
    private Boolean tbc;
    private List<MessageInfoType> messageInfo;
}
