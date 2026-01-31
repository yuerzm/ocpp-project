package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingLimitSourceEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfilePurposeEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Charging profile criterion type.
 */
@Data
public class ChargingProfileCriterionType {

    private ChargingProfilePurposeEnumType chargingProfilePurpose;
    private Integer stackLevel;
    private List<Integer> chargingProfileId;
    private List<ChargingLimitSourceEnumType> chargingLimitSource;
}
