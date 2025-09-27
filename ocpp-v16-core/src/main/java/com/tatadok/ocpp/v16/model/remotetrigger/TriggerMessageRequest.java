package com.tatadok.ocpp.v16.model.remotetrigger;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TriggerMessageRequest implements Request {

    private Integer connectorId;

    private MessageTrigger requestedMessage;

    public TriggerMessageRequest(MessageTrigger messageTrigger) {
        this.requestedMessage = messageTrigger;
    }

}
