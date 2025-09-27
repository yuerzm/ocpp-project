package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class PriceLevelScheduleEntryType {

    private Integer duration;
    private Integer priceLevel;
}
