package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ConnectorEnumType {

    cCCS1("cCCS1"),
    cCCS2("cCCS2"),
    cG105("cG105"),
    cTesla("cTesla"),
    cType1("cType1"),
    cType2("cType2"),
    s309_1P_16A("s309-1P-16A"),
    s309_1P_32A("s309-1P-32A"),
    s309_3P_16A("s309-3P-16A"),
    s309_3P_32A("s309-3P-32A"),
    sBS1361("sBS1361"),
    sCEE_7_7("sCEE-7-7"),
    sType2("sType2"),
    sType3("sType3"),
    Other1PhMax16A("Other1PhMax16A"),
    Other1PhOver16A("Other1PhOver16A"),
    Other3Ph("Other3Ph"),
    Pan("Pan"),
    wInductive("wInductive"),
    wResonant("wResonant"),
    Undetermined("Undetermined"),
    Unknown("Unknown");

    private final String value;

    ConnectorEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
