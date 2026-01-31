package com.cuckooy.ocpp.v21.model.cost;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Cost updated request.
 */
@Data
public class CostUpdatedRequest implements Request {

    private Double totalCost;
    private String transactionId;
}
