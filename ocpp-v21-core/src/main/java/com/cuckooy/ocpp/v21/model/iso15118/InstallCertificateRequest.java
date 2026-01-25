package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.InstallCertificateUseEnumType;
import lombok.Data;

@Data
public class InstallCertificateRequest implements Request {

    private InstallCertificateUseEnumType certificateType;
    private String certificate;
}
