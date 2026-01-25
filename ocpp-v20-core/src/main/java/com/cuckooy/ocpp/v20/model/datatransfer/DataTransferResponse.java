package com.cuckooy.ocpp.v20.model.datatransfer;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.DataTransferStatusEnumType;
import lombok.Data;

@Data
public class DataTransferResponse implements Response {

    private DataTransferStatusEnumType status;
    private Object data;
    private StatusInfoType statusInfo;

}
