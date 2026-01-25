package com.cuckooy.ocpp.core.exception;

import lombok.Getter;

@Getter
public class ErrorDetail {

    private String code;
    private String detail;

    public ErrorDetail(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }
}
