package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;

/**
 * The type Tariff type.
 */
@Data
public class TariffType {

    private String tariffId;
    private String currency;
    private Instant validFrom;
    private MessageContentType description;
}
