package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingStationType;
import com.cuckooy.ocpp.v21.model.common.enumerations.BootReasonEnumType;
import lombok.Data;

/**
 * The type Boot notification request.
 */
@Data
public class BootNotificationRequest implements Request {

    private ChargingStationType chargingStation;
    private BootReasonEnumType reason;
}
