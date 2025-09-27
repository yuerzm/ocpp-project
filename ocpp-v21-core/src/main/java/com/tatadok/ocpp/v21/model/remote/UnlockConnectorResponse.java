package com.tatadok.ocpp.v21.model.remote;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.UnlockStatusEnumType;
import lombok.Data;

@Data
public class UnlockConnectorResponse implements Response {

    private UnlockStatusEnumType status;
    private StatusInfoType statusInfo;
}
