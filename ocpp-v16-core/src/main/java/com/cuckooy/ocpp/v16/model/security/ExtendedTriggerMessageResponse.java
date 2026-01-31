package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.security.types.TriggerMessageStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Extended trigger message response.
 */
@Data
@NoArgsConstructor
public class ExtendedTriggerMessageResponse implements Response {

    private TriggerMessageStatusEnumType status;

}
