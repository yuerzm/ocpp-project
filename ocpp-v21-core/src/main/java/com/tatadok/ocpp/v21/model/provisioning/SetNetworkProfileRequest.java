package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.NetworkConnectionProfileType;
import lombok.Data;

@Data
public class SetNetworkProfileRequest implements Request {

    private Integer configurationSlot;
    private NetworkConnectionProfileType connectionData;
}
