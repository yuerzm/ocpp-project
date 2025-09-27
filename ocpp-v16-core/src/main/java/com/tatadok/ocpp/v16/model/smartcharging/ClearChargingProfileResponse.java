package com.tatadok.ocpp.v16.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClearChargingProfileResponse implements Response {

    private ClearChargingProfileStatus status;

}
