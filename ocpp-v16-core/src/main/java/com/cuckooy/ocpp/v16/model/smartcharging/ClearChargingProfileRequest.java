package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.core.ChargingProfilePurposeType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Clear charging profile request.
 */
@Data
@NoArgsConstructor
public class ClearChargingProfileRequest implements Request {

    private Integer id;

    private Integer connectorId;

    private ChargingProfilePurposeType chargingProfilePurpose;

    private Integer stackLevel;

}
