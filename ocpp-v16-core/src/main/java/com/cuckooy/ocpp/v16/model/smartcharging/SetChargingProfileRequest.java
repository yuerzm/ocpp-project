package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.core.ChargingProfile;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Set charging profile request.
 */
@Data
@NoArgsConstructor
public class SetChargingProfileRequest implements Request {

    private Integer connectorId;

    private ChargingProfile csChargingProfiles;

    /**
     * Instantiates a new Set charging profile request.
     *
     * @param connectorId     the connector id
     * @param chargingProfile the charging profile
     */
    public SetChargingProfileRequest(Integer connectorId, ChargingProfile chargingProfile) {
        this.connectorId = connectorId;
        this.csChargingProfiles = chargingProfile;
    }

}
