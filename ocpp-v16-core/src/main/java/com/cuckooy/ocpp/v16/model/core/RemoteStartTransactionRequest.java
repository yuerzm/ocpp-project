package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RemoteStartTransactionRequest implements Request {

    private Integer connectorId;

    private String idTag;

    private ChargingProfile chargingProfile;

}