package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.SetVariableResultType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariablesResponse implements Response {

    private List<SetVariableResultType> setVariableResult;
}
