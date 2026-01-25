package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum MessageFormatEnumType {

    ASCII("ASCII"),
    HTML("HTML"),
    URI("URI"),
    UTF8("UTF8");

    private final String value;

    MessageFormatEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
