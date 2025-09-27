package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MeterValuesRequest implements Request {

    private Integer connectorId;

    private Integer transactionId;

    private List<MeterValue> meterValue;
}
