package com.cuckooy.ocpp.v20.model.localauth;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.SendLocalListStatusEnumType;
import lombok.Data;

/**
 * The type Send local list response.
 */
@Data
public class SendLocalListResponse implements Response {

    private SendLocalListStatusEnumType status;
    private StatusInfoType statusInfo;
}
