package com.tatadok.ocpp.v20.model.reservation;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.IdTokenType;
import com.tatadok.ocpp.v20.model.common.enumerations.ConnectorEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ReserveNowRequest implements Request {

    private Integer id;
    private ZonedDateTime expiryDateTime;
    private ConnectorEnumType connectorType;
    private Integer evseId;
    private IdTokenType idToken;
    private IdTokenType groupIdToken;
}
