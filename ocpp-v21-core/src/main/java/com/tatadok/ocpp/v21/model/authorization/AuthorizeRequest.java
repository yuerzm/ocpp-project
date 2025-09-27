package com.tatadok.ocpp.v21.model.authorization;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.IdTokenType;
import com.tatadok.ocpp.v21.model.common.datatypes.OCSPRequestDataType;
import lombok.Data;

import java.util.List;

@Data
public class AuthorizeRequest implements Request {

    private IdTokenType idToken;
    private String certificate;
    private List<OCSPRequestDataType> iso15118CertificateHashData;
}
