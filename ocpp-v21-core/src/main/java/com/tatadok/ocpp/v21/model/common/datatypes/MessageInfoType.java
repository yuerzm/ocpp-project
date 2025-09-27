package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.MessagePriorityEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.MessageStateEnumType;
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
