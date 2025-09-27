package com.tatadok.ocpp.v21.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class PublishFirmwareRequest implements Request {

    private String location;
    private String checksum;
    private Integer requestId;
    private Integer retries;
    private Integer retryInterval;
}
