package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingProfileKindEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingProfilePurposeEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.RecurrencyKindEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * The type Charging profile type.
 */
@Data
public class ChargingProfileType {

    private Integer id;
    private Integer stackLevel;
    private ChargingProfilePurposeEnumType chargingProfilePurpose;
    private ChargingProfileKindEnumType chargingProfileKind;
    private List<ChargingScheduleType> chargingSchedule;
    private RecurrencyKindEnumType recurrencyKind;
    private Instant validFrom;
    private Instant validTo;
    private String transactionId;
}
