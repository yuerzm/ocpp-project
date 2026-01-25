package com.cuckooy.ocpp.v21.model.authorization;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ClearCacheStatusEnumType;
import lombok.Data;

@Data
public class ClearCacheResponse implements Response {

    private ClearCacheStatusEnumType status;
    private StatusInfoType statusInfo;
}
