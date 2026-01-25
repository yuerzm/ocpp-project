package com.cuckooy.ocpp.v16.model.localauthlist;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetLocalListVersionResponse implements Response {

    private Integer listVersion = -2;

}
