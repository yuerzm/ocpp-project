package com.cuckooy.ocpp.v20.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class ClearDisplayMessageRequest implements Request {

    private Integer id;
}
