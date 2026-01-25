package com.cuckooy.ocpp.v20.model.iso15118;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GetCertificateStatusEnumType;
import lombok.Data;

@Data
public class GetCertificateStatusResponse implements Response {

    private GetCertificateStatusEnumType status;
    private String ocspResult;
    private StatusInfoType statusInfo;

}
