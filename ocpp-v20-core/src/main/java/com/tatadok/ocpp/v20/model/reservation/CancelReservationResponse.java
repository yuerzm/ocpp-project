package com.tatadok.ocpp.v20.model.reservation;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.CancelReservationStatusEnumType;
import lombok.Data;

@Data
public class CancelReservationResponse implements Response {

    private CancelReservationStatusEnumType status;
    private StatusInfoType statusInfo;
}
