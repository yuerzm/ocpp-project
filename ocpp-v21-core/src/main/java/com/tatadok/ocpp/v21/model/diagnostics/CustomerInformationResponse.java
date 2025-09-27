package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.CustomerInformationStatusEnumType;
import lombok.Data;

@Data
public class CustomerInformationResponse implements Response {

    CustomerInformationStatusEnumType status;
    private StatusInfoType statusInfo;
}
