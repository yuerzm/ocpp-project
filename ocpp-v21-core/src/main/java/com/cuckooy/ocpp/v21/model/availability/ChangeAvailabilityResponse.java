package com.cuckooy.ocpp.v21.model.availability;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ChangeAvailabilityStatusEnumType;
import lombok.Data;

/**
 * The type Change availability response.
 */
@Data
public class ChangeAvailabilityResponse implements Response {

    private ChangeAvailabilityStatusEnumType status;
    private StatusInfoType statusInfo;
}
