package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfilePurposeEnumType;
import lombok.Data;

/**
 * The type Clear charging profile type.
 */
@Data
public class ClearChargingProfileType {

    private Integer evseId;
    private ChargingProfilePurposeEnumType chargingProfilePurpose;
    private Integer stackLevel;
}
