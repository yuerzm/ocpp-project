package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class UnpublishFirmwareRequest implements Request {

    private String checksum;
}
