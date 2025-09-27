package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.ReasonEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.ChargingStateEnumType;
import lombok.Data;

@Data
public class TransactionType {

    private String transactionId;
    private ChargingStateEnumType chargingState;
    private Integer timeSpentCharging;
    private ReasonEnumType stoppedReason;
    private Integer remoteStartId;
}
