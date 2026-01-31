package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Publish firmware request.
 */
@Data
public class PublishFirmwareRequest implements Request {

    private String location;
    private String checksum;
    private Integer requestId;
    private Integer retries;
    private Integer retryInterval;
}
