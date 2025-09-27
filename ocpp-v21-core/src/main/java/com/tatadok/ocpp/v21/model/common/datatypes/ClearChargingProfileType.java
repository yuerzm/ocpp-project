package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.ChargingProfilePurposeEnumType;
import lombok.Data;

@Data
public class ClearChargingProfileType {

    private Integer evseId;
    private ChargingProfilePurposeEnumType chargingProfilePurpose;
    private Integer stackLevel;
}
