package com.tatadok.ocpp.v21.model.displaymessage;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.ClearMessageStatusEnumType;
import lombok.Data;

@Data
public class ClearDisplayMessageResponse implements Response {

    private ClearMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
