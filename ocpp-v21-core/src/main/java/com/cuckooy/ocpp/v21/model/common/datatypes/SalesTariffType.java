package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Sales tariff type.
 */
@Data
public class SalesTariffType {

    private Integer id;
    private List<SalesTariffEntryType> salesTariffEntry;
    private String salesTariffDescription;
    private Integer numEPriceLevels;
}
