package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingStationType;
import com.cuckooy.ocpp.v20.model.common.enumerations.BootReasonEnumType;
import lombok.Data;

@Data
public class BootNotificationRequest implements Request {

    private ChargingStationType chargingStation;
    private BootReasonEnumType reason;
}
