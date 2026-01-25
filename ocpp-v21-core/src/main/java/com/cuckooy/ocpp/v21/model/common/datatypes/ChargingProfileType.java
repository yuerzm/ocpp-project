package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfileKindEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfilePurposeEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.RecurrencyKindEnumType;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class ChargingProfileType {

    private Integer id;
    private Integer stackLevel;
    private ChargingProfilePurposeEnumType chargingProfilePurpose;
    private ChargingProfileKindEnumType chargingProfileKind;
    private List<ChargingScheduleType> chargingSchedule;
    private RecurrencyKindEnumType recurrencyKind;
    private ZonedDateTime validFrom;
    private ZonedDateTime validTo;
    private String transactionId;

    private Integer maxOfflineDuration;
    private Boolean invalidAfterOfflineDuration;
    private Integer dynUpdateInterval;
    private ZonedDateTime dynUpdateTime;
    private String priceScheduleSignature;
}
