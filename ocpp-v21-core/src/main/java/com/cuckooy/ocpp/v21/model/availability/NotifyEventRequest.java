package com.cuckooy.ocpp.v21.model.availability;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.EventDataType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class NotifyEventRequest implements Request {

    private Instant generatedAt;
    private Integer seqNo;
    private List<EventDataType> eventData;
    private Boolean tbc = false;
}
