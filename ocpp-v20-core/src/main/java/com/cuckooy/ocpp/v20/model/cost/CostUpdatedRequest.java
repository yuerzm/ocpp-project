package com.cuckooy.ocpp.v20.model.cost;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class CostUpdatedRequest implements Request {

    private Double totalCost;
    private String transactionId;
}
