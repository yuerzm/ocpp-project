package com.cuckooy.ocpp.v16.model.remotetrigger;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Trigger message request.
 */
@Data
@NoArgsConstructor
public class TriggerMessageRequest implements Request {

    private Integer connectorId;

    private MessageTrigger requestedMessage;

    /**
     * Instantiates a new Trigger message request.
     *
     * @param messageTrigger the message trigger
     */
    public TriggerMessageRequest(MessageTrigger messageTrigger) {
        this.requestedMessage = messageTrigger;
    }

}
