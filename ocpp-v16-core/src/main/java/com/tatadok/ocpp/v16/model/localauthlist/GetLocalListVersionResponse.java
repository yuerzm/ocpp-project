package com.tatadok.ocpp.v16.model.localauthlist;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetLocalListVersionResponse implements Response {

    private Integer listVersion = -2;

}
