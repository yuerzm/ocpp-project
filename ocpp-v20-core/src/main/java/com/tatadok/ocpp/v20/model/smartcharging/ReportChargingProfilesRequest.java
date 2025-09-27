package com.tatadok.ocpp.v20.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.ChargingProfileType;
import com.tatadok.ocpp.v20.model.common.enumerations.ChargingLimitSourceEnumType;
import lombok.Data;

import java.util.List;

@Data
public class ReportChargingProfilesRequest implements Request {

    private Integer requestId;
    private ChargingLimitSourceEnumType chargingLimitSource;
    private Integer evseId;
    private List<ChargingProfileType> chargingProfile;
    private Boolean tbc = false;
}
