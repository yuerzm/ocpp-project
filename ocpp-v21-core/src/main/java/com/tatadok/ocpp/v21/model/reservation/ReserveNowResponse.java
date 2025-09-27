package com.tatadok.ocpp.v21.model.reservation;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.ReserveNowStatusEnumType;
import lombok.Data;

@Data
public class ReserveNowResponse implements Response {

    private ReserveNowStatusEnumType status;
    private StatusInfoType statusInfo;
}
