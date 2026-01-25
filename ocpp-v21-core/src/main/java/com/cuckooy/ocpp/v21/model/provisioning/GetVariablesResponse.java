package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.GetVariableResultType;
import lombok.Data;

import java.util.List;

@Data
public class GetVariablesResponse implements Response {

    private List<GetVariableResultType> getVariableResult;
}
