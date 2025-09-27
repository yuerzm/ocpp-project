package com.tatadok.ocpp.v20.model.iso15118;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.InstallCertificateUseEnumType;
import lombok.Data;

@Data
public class InstallCertificateRequest implements Request {

    private InstallCertificateUseEnumType certificateType;
    private String certificate;
}
