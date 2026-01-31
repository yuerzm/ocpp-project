package com.cuckooy.ocpp.v21.model.remote;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingProfileType;
import com.cuckooy.ocpp.v21.model.common.datatypes.IdTokenType;
import lombok.Data;

/**
 * The type Request start transaction request.
 */
@Data
public class RequestStartTransactionRequest implements Request {

    private Integer remoteStartId;
    private IdTokenType idToken;
    private Integer evseId;
    private ChargingProfileType chargingProfile;
    private IdTokenType groupIdToken;
}
