package com.cuckooy.ocpp.v21.model.datatransfer;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.DataTransferStatusEnumType;
import lombok.Data;

/**
 * The type Data transfer response.
 */
@Data
public class DataTransferResponse implements Response {

    private DataTransferStatusEnumType status;
    private Object data;
    private StatusInfoType statusInfo;

}
