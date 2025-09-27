package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class StatusNotificationRequest implements Request {

    private Integer connectorId;

    private ChargePointStatus status;
    private ChargePointErrorCode errorCode;

    private String info;

    private ZonedDateTime timestamp;

    private String vendorId;

    private String vendorErrorCode;

}
