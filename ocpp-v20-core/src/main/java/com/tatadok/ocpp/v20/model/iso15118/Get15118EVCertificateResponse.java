package com.tatadok.ocpp.v20.model.iso15118;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.Iso15118EVCertificateStatusEnumType;
import lombok.Data;

@Data
public class Get15118EVCertificateResponse implements Response {

    private Iso15118EVCertificateStatusEnumType status;
    private String exiResponse;
    private StatusInfoType statusInfo;
}
