package com.cuckooy.ocpp.v20.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.MessagePriorityEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.MessageStateEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetDisplayMessagesRequest implements Request {

    private Integer requestId;
    private List<Integer> id;
    private MessagePriorityEnumType priority;
    private MessageStateEnumType state;
}
