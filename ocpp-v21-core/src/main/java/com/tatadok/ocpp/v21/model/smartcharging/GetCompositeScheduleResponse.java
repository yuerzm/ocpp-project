package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.CompositeScheduleType;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

@Data
public class GetCompositeScheduleResponse implements Response {

    private GenericStatusEnumType status;
    private CompositeScheduleType schedule;
    private StatusInfoType statusInfo;
}
