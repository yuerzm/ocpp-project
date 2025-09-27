package com.tatadok.ocpp.v20.model.displaymessage;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.MessageInfoType;
import lombok.Data;

@Data
public class SetDisplayMessageRequest implements Request {

    private MessageInfoType message;
}
