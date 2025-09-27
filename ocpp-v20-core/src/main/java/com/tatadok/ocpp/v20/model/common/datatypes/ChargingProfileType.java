package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.ChargingProfileKindEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.ChargingProfilePurposeEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.RecurrencyKindEnumType;
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
}
