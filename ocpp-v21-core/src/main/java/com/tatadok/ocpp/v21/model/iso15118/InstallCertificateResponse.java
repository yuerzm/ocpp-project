package com.tatadok.ocpp.v21.model.iso15118;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.InstallCertificateStatusEnumType;
import lombok.Data;

@Data
public class InstallCertificateResponse implements Response {

    private InstallCertificateStatusEnumType status;
    private StatusInfoType statusInfo;
}
