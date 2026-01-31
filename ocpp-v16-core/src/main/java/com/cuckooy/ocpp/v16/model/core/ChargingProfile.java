package com.cuckooy.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * The type Charging profile.
 */
@Data
@NoArgsConstructor
public class ChargingProfile {

    private Integer chargingProfileId;

    private Integer transactionId;

    private Integer stackLevel;

    private ChargingProfilePurposeType chargingProfilePurpose;

    private ChargingProfileKindType chargingProfileKind;

    private RecurrencyKindType recurrencyKind;

    private Instant validFrom;

    private Instant validTo;

    private ChargingSchedule chargingSchedule;

}
