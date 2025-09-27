package com.tatadok.ocpp.v21.model.authorization;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.ClearCacheStatusEnumType;
import lombok.Data;

@Data
public class ClearCacheResponse implements Response {

    private ClearCacheStatusEnumType status;
    private StatusInfoType statusInfo;
}
