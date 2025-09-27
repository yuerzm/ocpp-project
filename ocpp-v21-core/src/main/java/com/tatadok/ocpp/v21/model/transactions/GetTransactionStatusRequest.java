package com.tatadok.ocpp.v21.model.transactions;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class GetTransactionStatusRequest implements Request {

    private String transactionId;
}
