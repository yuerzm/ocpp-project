package com.cuckooy.ocpp.v21.model.reservation;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.CancelReservationStatusEnumType;
import lombok.Data;

@Data
public class CancelReservationResponse implements Response {

    private CancelReservationStatusEnumType status;
    private StatusInfoType statusInfo;
}
