package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Der unit enum type.
 */
public enum DERUnitEnumType {

    /**
     * Not applicable der unit enum type.
     */
    Not_Applicable("Not_Applicable"),
    /**
     * Pct max w der unit enum type.
     */
    PctMaxW("PctMaxW"),
    /**
     * Pct max var der unit enum type.
     */
    PctMaxVar("PctMaxVar"),
    /**
     * Pct w avail der unit enum type.
     */
    PctWAvail("PctWAvail"),
    /**
     * Pct var avail der unit enum type.
     */
    PctVarAvail("PctVarAvail"),
    /**
     * Pct effective v der unit enum type.
     */
    PctEffectiveV("PctEffectiveV"),
    ;

    private final String value;

    DERUnitEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
