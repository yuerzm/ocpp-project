package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Message format enum type.
 */
public enum MessageFormatEnumType {

    /**
     * Ascii message format enum type.
     */
    ASCII("ASCII"),
    /**
     * Html message format enum type.
     */
    HTML("HTML"),
    /**
     * Uri message format enum type.
     */
    URI("URI"),
    /**
     * Utf 8 message format enum type.
     */
    UTF8("UTF8"),
    /**
     * Qrcode message format enum type.
     */
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
