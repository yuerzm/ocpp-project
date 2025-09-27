package com.tatadok.ocpp.v21.model.availability;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.EventDataType;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class NotifyEventRequest implements Request {

    private ZonedDateTime generatedAt;
    private Integer seqNo;
    private List<EventDataType> eventData;
    private Boolean tbc = false;
}
