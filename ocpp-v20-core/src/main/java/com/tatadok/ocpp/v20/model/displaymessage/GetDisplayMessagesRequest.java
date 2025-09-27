package com.tatadok.ocpp.v20.model.displaymessage;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.MessagePriorityEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.MessageStateEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetDisplayMessagesRequest implements Request {

    private Integer requestId;
    private List<Integer> id;
    private MessagePriorityEnumType priority;
    private MessageStateEnumType state;
}
