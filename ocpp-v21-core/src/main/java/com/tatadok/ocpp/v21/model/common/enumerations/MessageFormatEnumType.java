package com.tatadok.ocpp.v21.model.common.enumerations;

public enum MessageFormatEnumType {

    ASCII("ASCII"),
    HTML("HTML"),
    URI("URI"),
    UTF8("UTF8"),
    QRCODE("QRCODE"),
    ;

    private final String value;

    MessageFormatEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
