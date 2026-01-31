package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ComponentVariableType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ComponentCriterionEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Get report request.
 */
@Data
public class GetReportRequest implements Request {

    private Integer requestId;
    private List<ComponentCriterionEnumType> componentCriteria;
    private List<ComponentVariableType> componentVariable;
}
