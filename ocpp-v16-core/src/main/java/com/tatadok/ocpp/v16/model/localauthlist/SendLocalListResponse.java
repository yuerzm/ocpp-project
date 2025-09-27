package com.tatadok.ocpp.v16.model.localauthlist;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SendLocalListResponse implements Response {

    private UpdateStatus status;

}
