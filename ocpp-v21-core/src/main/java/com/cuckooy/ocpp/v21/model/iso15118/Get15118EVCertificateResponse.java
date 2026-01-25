package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.Iso15118EVCertificateStatusEnumType;
import lombok.Data;

@Data
public class Get15118EVCertificateResponse implements Response {

    private Iso15118EVCertificateStatusEnumType status;
    private String exiResponse;
    private StatusInfoType statusInfo;
}
