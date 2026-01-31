package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Boot notification request.
 */
@Data
@NoArgsConstructor
public class BootNotificationRequest implements Request {

    private String chargeBoxSerialNumber;

    private String chargePointModel;

    private String chargePointSerialNumber;

    private String chargePointVendor;

    private String firmwareVersion;

    private String iccid;

    private String imsi;

    private String meterSerialNumber;

    private String meterType;

}
