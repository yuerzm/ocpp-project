package com.tatadok.ocpp.v21.model.common.enumerations;

public enum DERUnitEnumType {

    Not_Applicable("Not_Applicable"),
    PctMaxW("PctMaxW"),
    PctMaxVar("PctMaxVar"),
    PctWAvail("PctWAvail"),
    PctVarAvail("PctVarAvail"),
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
