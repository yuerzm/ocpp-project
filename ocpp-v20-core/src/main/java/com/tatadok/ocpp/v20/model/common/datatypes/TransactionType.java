package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.ChargingStateEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.ReasonEnumType;
import lombok.Data;

@Data
public class TransactionType {

    private String transactionId;
    private ChargingStateEnumType chargingState;
    private Integer timeSpentCharging;
    private ReasonEnumType stoppedReason;
    private Integer remoteStartId;
}
