package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Tariff energy price type.
 */
@Data
public class TariffEnergyPriceType {

    private BigDecimal priceKwh;

}
