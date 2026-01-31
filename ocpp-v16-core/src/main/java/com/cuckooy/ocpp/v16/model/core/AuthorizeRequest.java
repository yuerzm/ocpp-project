package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Authorize request.
 */
@Data
@NoArgsConstructor
public class AuthorizeRequest implements Request {

    private String idTag;

}
