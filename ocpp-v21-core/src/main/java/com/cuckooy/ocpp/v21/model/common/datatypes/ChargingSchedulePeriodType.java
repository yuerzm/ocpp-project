package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.OperationModeEnumType;
import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Charging schedule period type.
 */
@Data
public class ChargingSchedulePeriodType {

    private Integer startPeriod;
    private BigDecimal limit;
    private BigDecimal limit_L2;
    private BigDecimal limit_L3;
    private Integer numberPhases;
    private Integer phaseToUse;
    private BigDecimal dischargeLimit;
    private BigDecimal dischargeLimit_L2;
    private BigDecimal dischargeLimit_L3;
    private BigDecimal setpoint;
    private BigDecimal setpoint_L2;
    private BigDecimal setpoint_L3;
    private BigDecimal setpointReactive;
    private BigDecimal setpointReactive_L2;
    private BigDecimal setpointReactive_L3;
    private Boolean preconditioningRequest;
    private Boolean evseSleep;
    private BigDecimal v2xBaseline;
    private OperationModeEnumType operationMode;
    private V2XFreqWattPointType v2xFreqWattCurve;
    private V2XSignalWattPointType v2xSignalWattCurve;

}
