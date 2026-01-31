package com.cuckooy.ocpp.v21.model.displaymessage;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Clear display message request.
 */
@Data
public class ClearDisplayMessageRequest implements Request {

    private Integer id;
}
