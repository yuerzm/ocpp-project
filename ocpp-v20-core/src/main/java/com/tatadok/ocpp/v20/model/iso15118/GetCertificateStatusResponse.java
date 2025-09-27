package com.tatadok.ocpp.v20.model.iso15118;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.GetCertificateStatusEnumType;
import lombok.Data;

@Data
public class GetCertificateStatusResponse implements Response {

    private GetCertificateStatusEnumType status;
    private String ocspResult;
    private StatusInfoType statusInfo;

}
