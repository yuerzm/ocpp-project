package com.cuckooy.ocpp.v21.model.authorization;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.IdTokenType;
import com.cuckooy.ocpp.v21.model.common.datatypes.OCSPRequestDataType;
import lombok.Data;

import java.util.List;

/**
 * The type Authorize request.
 */
@Data
public class AuthorizeRequest implements Request {

    private IdTokenType idToken;
    private String certificate;
    private List<OCSPRequestDataType> iso15118CertificateHashData;
}
