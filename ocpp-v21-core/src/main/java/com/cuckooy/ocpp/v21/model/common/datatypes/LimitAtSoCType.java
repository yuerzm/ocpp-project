package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Limit at so c type.
 */
@Data
public class LimitAtSoCType {

    private Integer soc;
    private BigDecimal limit;
}
