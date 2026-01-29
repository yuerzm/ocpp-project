package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfileKindEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfilePurposeEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.RecurrencyKindEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

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

    private Integer maxOfflineDuration;
    private Boolean invalidAfterOfflineDuration;
    private Integer dynUpdateInterval;
    private Instant dynUpdateTime;
    private String priceScheduleSignature;
}
