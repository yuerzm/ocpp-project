package com.tatadok.ocpp.v21.model.iso15118;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.GetCertificateStatusEnumType;
import lombok.Data;

@Data
public class GetCertificateStatusResponse implements Response {

    private GetCertificateStatusEnumType status;
    private String ocspResult;
    private StatusInfoType statusInfo;

}
