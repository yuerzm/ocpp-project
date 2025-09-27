package com.tatadok.ocpp.v16.model.remotetrigger;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TriggerMessageResponse implements Response {

    private TriggerMessageStatus status;

}