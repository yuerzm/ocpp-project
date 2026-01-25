package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.MessagePriorityEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.MessageStateEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class MessageInfoType {

    private Integer id;
    private MessagePriorityEnumType priority;
    private MessageStateEnumType state;
    private ZonedDateTime startDateTime;
    private ZonedDateTime endDateTime;
    private String transactionId;
    private MessageContentType message;
    private ComponentType display;
}
