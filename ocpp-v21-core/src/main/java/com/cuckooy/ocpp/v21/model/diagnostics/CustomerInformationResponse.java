package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.CustomerInformationStatusEnumType;
import lombok.Data;

@Data
public class CustomerInformationResponse implements Response {

    CustomerInformationStatusEnumType status;
    private StatusInfoType statusInfo;
}
