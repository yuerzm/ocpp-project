package com.cuckooy.ocpp.v20.model.availability;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ChangeAvailabilityStatusEnumType;
import lombok.Data;

@Data
public class ChangeAvailabilityResponse implements Response {

    private ChangeAvailabilityStatusEnumType status;
    private StatusInfoType statusInfo;
}
