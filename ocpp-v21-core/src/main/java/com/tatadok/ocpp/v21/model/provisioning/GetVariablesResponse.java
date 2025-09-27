package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.GetVariableResultType;
import lombok.Data;

import java.util.List;

@Data
public class GetVariablesResponse implements Response {

    private List<GetVariableResultType> getVariableResult;
}
