package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.ChargingStationType;
import com.tatadok.ocpp.v21.model.common.enumerations.BootReasonEnumType;
import lombok.Data;

@Data
public class BootNotificationRequest implements Request {

    private ChargingStationType chargingStation;
    private BootReasonEnumType reason;
}
