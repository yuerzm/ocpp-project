package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.CompositeScheduleType;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Get composite schedule response.
 */
@Data
public class GetCompositeScheduleResponse implements Response {

    private GenericStatusEnumType status;
    private CompositeScheduleType schedule;
    private StatusInfoType statusInfo;
}
