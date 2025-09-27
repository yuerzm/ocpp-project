package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v16.model.security.types.CertificateUseEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetInstalledCertificateIdsRequest implements Request {

    private CertificateUseEnumType certificateType;

}
