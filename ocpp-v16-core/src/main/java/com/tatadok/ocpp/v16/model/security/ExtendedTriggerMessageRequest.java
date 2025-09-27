package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v16.model.security.types.MessageTriggerEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExtendedTriggerMessageRequest implements Request {

    private MessageTriggerEnumType requestedMessage;
    private Integer connectorId;
}
