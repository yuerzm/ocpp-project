package com.tatadok.ocpp.v21.model.datatransfer;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.DataTransferStatusEnumType;
import lombok.Data;

@Data
public class DataTransferResponse implements Response {

    private DataTransferStatusEnumType status;
    private Object data;
    private StatusInfoType statusInfo;

}
