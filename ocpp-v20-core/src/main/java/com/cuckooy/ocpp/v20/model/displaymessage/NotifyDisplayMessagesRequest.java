package com.cuckooy.ocpp.v20.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.MessageInfoType;
import lombok.Data;

import java.util.List;

/**
 * The type Notify display messages request.
 */
@Data
public class NotifyDisplayMessagesRequest implements Request {

    private Integer requestId;
    private Boolean tbc;
    private List<MessageInfoType> messageInfo;
}
