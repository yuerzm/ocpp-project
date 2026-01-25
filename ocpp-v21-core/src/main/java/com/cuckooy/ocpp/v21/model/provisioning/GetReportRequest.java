package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ComponentVariableType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ComponentCriterionEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetReportRequest implements Request {

    private Integer requestId;
    private List<ComponentCriterionEnumType> componentCriteria;
    private List<ComponentVariableType> componentVariable;
}
