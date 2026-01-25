package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingStateEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ReasonEnumType;
import lombok.Data;

@Data
public class TransactionType {

    private String transactionId;
    private ChargingStateEnumType chargingState;
    private Integer timeSpentCharging;
    private ReasonEnumType stoppedReason;
    private Integer remoteStartId;
}
