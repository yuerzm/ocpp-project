package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class TariffType {

    private String tariffId;
    private String currency;
    private ZonedDateTime validFrom;
    private MessageContentType description;
}
