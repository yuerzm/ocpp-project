package com.tatadok.ocpp.v20.model.availability;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.ChangeAvailabilityStatusEnumType;
import lombok.Data;

@Data
public class ChangeAvailabilityResponse implements Response {

    private ChangeAvailabilityStatusEnumType status;
    private StatusInfoType statusInfo;
}
