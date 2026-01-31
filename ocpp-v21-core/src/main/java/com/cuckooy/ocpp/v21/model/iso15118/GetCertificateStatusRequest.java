package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.OCSPRequestDataType;
import lombok.Data;

/**
 * The type Get certificate status request.
 */
@Data
public class GetCertificateStatusRequest implements Request {

    private OCSPRequestDataType ocspRequestData;
}
