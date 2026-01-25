package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.SetVariableResultType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariablesResponse implements Response {

    private List<SetVariableResultType> setVariableResult;
}
