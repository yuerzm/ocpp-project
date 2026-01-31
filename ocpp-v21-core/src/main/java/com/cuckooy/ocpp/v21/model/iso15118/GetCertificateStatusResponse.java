package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GetCertificateStatusEnumType;
import lombok.Data;

/**
 * The type Get certificate status response.
 */
@Data
public class GetCertificateStatusResponse implements Response {

    private GetCertificateStatusEnumType status;
    private String ocspResult;
    private StatusInfoType statusInfo;

}
