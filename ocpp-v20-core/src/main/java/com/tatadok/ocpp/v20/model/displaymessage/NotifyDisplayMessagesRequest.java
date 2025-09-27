package com.tatadok.ocpp.v20.model.displaymessage;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.MessageInfoType;
import lombok.Data;

import java.util.List;

@Data
public class NotifyDisplayMessagesRequest implements Request {

    private Integer requestId;
    private Boolean tbc;
    private List<MessageInfoType> messageInfo;
}
