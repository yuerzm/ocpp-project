package com.tatadok.ocpp.v20.model.remote;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.ChargingProfileType;
import com.tatadok.ocpp.v20.model.common.datatypes.IdTokenType;
import lombok.Data;

@Data
public class RequestStartTransactionRequest implements Request {

    private Integer remoteStartId;
    private IdTokenType idToken;
    private Integer evseId;
    private ChargingProfileType chargingProfile;
    private IdTokenType groupIdToken;
}
