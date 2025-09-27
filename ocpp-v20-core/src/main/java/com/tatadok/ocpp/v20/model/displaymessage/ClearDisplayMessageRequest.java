package com.tatadok.ocpp.v20.model.displaymessage;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class ClearDisplayMessageRequest implements Request {

    private Integer id;
}
