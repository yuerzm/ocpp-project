package com.cuckooy.ocpp.v21.model.reservation;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.IdTokenType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ConnectorEnumType;
import lombok.Data;

import java.time.Instant;

@Data
public class ReserveNowRequest implements Request {

    private Integer id;
    private Instant expiryDateTime;
    private ConnectorEnumType connectorType;
    private Integer evseId;
    private IdTokenType idToken;
    private IdTokenType groupIdToken;
}
