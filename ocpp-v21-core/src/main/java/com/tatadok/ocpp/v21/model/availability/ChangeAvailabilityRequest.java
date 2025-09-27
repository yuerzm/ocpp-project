package com.tatadok.ocpp.v21.model.availability;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.EVSEType;
import com.tatadok.ocpp.v21.model.common.enumerations.OperationalStatusEnumType;
import lombok.Data;

@Data
public class ChangeAvailabilityRequest implements Request {

    private OperationalStatusEnumType operationalStatus;
    private EVSEType evse;
}
