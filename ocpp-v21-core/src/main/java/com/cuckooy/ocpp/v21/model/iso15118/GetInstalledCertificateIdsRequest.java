package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.GetCertificateIdUseEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Get installed certificate ids request.
 */
@Data
public class GetInstalledCertificateIdsRequest implements Request {

    private List<GetCertificateIdUseEnumType> certificateType;
}
