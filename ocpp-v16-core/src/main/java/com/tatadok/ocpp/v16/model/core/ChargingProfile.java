package com.tatadok.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class ChargingProfile {

    private Integer chargingProfileId;

    private Integer transactionId;

    private Integer stackLevel;

    private ChargingProfilePurposeType chargingProfilePurpose;

    private ChargingProfileKindType chargingProfileKind;

    private RecurrencyKindType recurrencyKind;

    private ZonedDateTime validFrom;

    private ZonedDateTime validTo;

    private ChargingSchedule chargingSchedule;

}
