package com.cuckooy.ocpp.v21.model.availability;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.EVSEType;
import com.cuckooy.ocpp.v21.model.common.enumerations.OperationalStatusEnumType;
import lombok.Data;

/**
 * The type Change availability request.
 */
@Data
public class ChangeAvailabilityRequest implements Request {

    private OperationalStatusEnumType operationalStatus;
    private EVSEType evse;
}
