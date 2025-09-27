package com.tatadok.ocpp.v20.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.ChargingLimitSourceEnumType;
import lombok.Data;

@Data
public class ClearedChargingLimitRequest implements Request {

    private ChargingLimitSourceEnumType chargingLimitSource;
    private Integer evseId;

}
