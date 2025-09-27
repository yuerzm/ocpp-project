package com.tatadok.ocpp.v21.model.displaymessage;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.DisplayMessageStatusEnumType;
import lombok.Data;

@Data
public class SetDisplayMessageResponse implements Response {

    private DisplayMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
