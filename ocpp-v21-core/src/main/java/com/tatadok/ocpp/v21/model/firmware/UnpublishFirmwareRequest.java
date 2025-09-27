package com.tatadok.ocpp.v21.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class UnpublishFirmwareRequest implements Request {

    private String checksum;
}
