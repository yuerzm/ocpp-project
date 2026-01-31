package com.cuckooy.ocpp.v16.model.remotetrigger;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Trigger message response.
 */
@Data
@NoArgsConstructor
public class TriggerMessageResponse implements Response {

    private TriggerMessageStatus status;

}