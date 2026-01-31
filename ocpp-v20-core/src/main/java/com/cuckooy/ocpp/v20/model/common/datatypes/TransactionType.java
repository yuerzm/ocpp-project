package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingStateEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ReasonEnumType;
import lombok.Data;

/**
 * The type Transaction type.
 */
@Data
public class TransactionType {

    private String transactionId;
    private ChargingStateEnumType chargingState;
    private Integer timeSpentCharging;
    private ReasonEnumType stoppedReason;
    private Integer remoteStartId;
}
