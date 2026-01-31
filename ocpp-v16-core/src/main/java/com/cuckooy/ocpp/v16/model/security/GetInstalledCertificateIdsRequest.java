package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.CertificateUseEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Get installed certificate ids request.
 */
@Data
@NoArgsConstructor
public class GetInstalledCertificateIdsRequest implements Request {

    private CertificateUseEnumType certificateType;

}
