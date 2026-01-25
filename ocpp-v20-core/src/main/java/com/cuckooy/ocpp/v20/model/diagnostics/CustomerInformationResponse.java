package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.CustomerInformationStatusEnumType;
import lombok.Data;

@Data
public class CustomerInformationResponse implements Response {

    CustomerInformationStatusEnumType status;
    private StatusInfoType statusInfo;
}
