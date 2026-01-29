package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.MessagePriorityEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.MessageStateEnumType;
import lombok.Data;

import java.time.Instant;

@Data
public class MessageInfoType {

    private Integer id;
    private MessagePriorityEnumType priority;
    private MessageStateEnumType state;
    private Instant startDateTime;
    private Instant endDateTime;
    private String transactionId;
    private MessageContentType message;
    private ComponentType display;
}
