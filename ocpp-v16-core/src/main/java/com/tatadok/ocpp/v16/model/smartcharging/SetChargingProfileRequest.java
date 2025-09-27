package com.tatadok.ocpp.v16.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v16.model.core.ChargingProfile;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SetChargingProfileRequest implements Request {

    private Integer connectorId;

    private ChargingProfile csChargingProfiles;

    public SetChargingProfileRequest(Integer connectorId, ChargingProfile chargingProfile) {
        this.connectorId = connectorId;
        this.csChargingProfiles = chargingProfile;
    }

}
