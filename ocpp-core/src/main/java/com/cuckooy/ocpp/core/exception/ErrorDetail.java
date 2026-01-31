package com.cuckooy.ocpp.core.exception;

import lombok.Getter;

/**
 * The type Error detail.
 */
@Getter
public class ErrorDetail {

    private String code;
    private String detail;

    /**
     * Instantiates a new Error detail.
     *
     * @param code   the code
     * @param detail the detail
     */
    public ErrorDetail(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }
}
