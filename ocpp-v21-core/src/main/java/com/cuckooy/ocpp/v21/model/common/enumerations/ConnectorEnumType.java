package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Connector enum type.
 */
public enum ConnectorEnumType {

    /**
     * C ccs 1 connector enum type.
     */
    cCCS1("cCCS1"),
    /**
     * C ccs 2 connector enum type.
     */
    cCCS2("cCCS2"),
    /**
     * C g 105 connector enum type.
     */
    cG105("cG105"),
    /**
     * C tesla connector enum type.
     */
    cTesla("cTesla"),
    /**
     * C type 1 connector enum type.
     */
    cType1("cType1"),
    /**
     * C type 2 connector enum type.
     */
    cType2("cType2"),
    /**
     * S 309 1 p 16 a connector enum type.
     */
    s309_1P_16A("s309-1P-16A"),
    /**
     * S 309 1 p 32 a connector enum type.
     */
    s309_1P_32A("s309-1P-32A"),
    /**
     * S 309 3 p 16 a connector enum type.
     */
    s309_3P_16A("s309-3P-16A"),
    /**
     * S 309 3 p 32 a connector enum type.
     */
    s309_3P_32A("s309-3P-32A"),
    /**
     * S bs 1361 connector enum type.
     */
    sBS1361("sBS1361"),
    /**
     * S cee 7 7 connector enum type.
     */
    sCEE_7_7("sCEE-7-7"),
    /**
     * S type 2 connector enum type.
     */
    sType2("sType2"),
    /**
     * S type 3 connector enum type.
     */
    sType3("sType3"),
    /**
     * Other 1 ph max 16 a connector enum type.
     */
    Other1PhMax16A("Other1PhMax16A"),
    /**
     * Other 1 ph over 16 a connector enum type.
     */
    Other1PhOver16A("Other1PhOver16A"),
    /**
     * Other 3 ph connector enum type.
     */
    Other3Ph("Other3Ph"),
    /**
     * Pan connector enum type.
     */
    Pan("Pan"),
    /**
     * W inductive connector enum type.
     */
    wInductive("wInductive"),
    /**
     * W resonant connector enum type.
     */
    wResonant("wResonant"),
    /**
     * Undetermined connector enum type.
     */
    Undetermined("Undetermined"),
    /**
     * Unknown connector enum type.
     */
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
