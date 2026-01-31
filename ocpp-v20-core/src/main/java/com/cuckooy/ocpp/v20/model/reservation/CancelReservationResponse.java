package com.cuckooy.ocpp.v20.model.reservation;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.CancelReservationStatusEnumType;
import lombok.Data;

/**
 * The type Cancel reservation response.
 */
@Data
public class CancelReservationResponse implements Response {

    private CancelReservationStatusEnumType status;
    private StatusInfoType statusInfo;
}
