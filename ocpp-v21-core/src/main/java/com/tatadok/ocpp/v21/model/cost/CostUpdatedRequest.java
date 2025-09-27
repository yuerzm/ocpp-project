package com.tatadok.ocpp.v21.model.cost;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class CostUpdatedRequest implements Request {

    private Double totalCost;
    private String transactionId;
}
