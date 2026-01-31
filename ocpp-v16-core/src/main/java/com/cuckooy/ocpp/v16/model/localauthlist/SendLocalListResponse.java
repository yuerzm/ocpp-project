package com.cuckooy.ocpp.v16.model.localauthlist;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Send local list response.
 */
@Data
@NoArgsConstructor
public class SendLocalListResponse implements Response {

    private UpdateStatus status;

}
