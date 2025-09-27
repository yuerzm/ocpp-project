package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.ChargingLimitSourceEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.ChargingProfilePurposeEnumType;
import lombok.Data;

import java.util.List;

@Data
public class ChargingProfileCriterionType {

    private ChargingProfilePurposeEnumType chargingProfilePurpose;
    private Integer stackLevel;
    private List<Integer> chargingProfileId;
    private List<ChargingLimitSourceEnumType> chargingLimitSource;
}
