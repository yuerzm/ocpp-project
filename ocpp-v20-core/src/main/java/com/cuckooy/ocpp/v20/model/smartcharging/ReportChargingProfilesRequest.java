package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingProfileType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingLimitSourceEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Report charging profiles request.
 */
@Data
public class ReportChargingProfilesRequest implements Request {

    private Integer requestId;
    private ChargingLimitSourceEnumType chargingLimitSource;
    private Integer evseId;
    private List<ChargingProfileType> chargingProfile;
    private Boolean tbc = false;
}
