package com.cuckooy.ocpp.v20.model.availability;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.EVSEType;
import com.cuckooy.ocpp.v20.model.common.enumerations.OperationalStatusEnumType;
import lombok.Data;

@Data
public class ChangeAvailabilityRequest implements Request {

    private OperationalStatusEnumType operationalStatus;
    private EVSEType evse;
}
