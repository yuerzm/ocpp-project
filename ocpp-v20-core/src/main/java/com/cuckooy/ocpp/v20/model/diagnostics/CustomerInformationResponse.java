package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.CustomerInformationStatusEnumType;
import lombok.Data;

/**
 * The type Customer information response.
 */
@Data
public class CustomerInformationResponse implements Response {

    /**
     * The Status.
     */
    CustomerInformationStatusEnumType status;
    private StatusInfoType statusInfo;
}
