package com.tatadok.commons;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collections;
import java.util.Objects;

@Data
public final class Result implements Serializable {

    @Serial
    private static final long serialVersionUID = 8161684679180027438L;

    private static final int OK = 200;
    private static final int ERROR = 500;

    private static final int SUCCESS = 1;
    private static final int FAILED = 0;

    private final int status;
    private final int code;
    private final String message;
    private final Object data;
    private final long timestamp;

    private Result(int status, int code, String message, Object data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = Objects.nonNull(data) ? data : Collections.emptyMap();
        this.timestamp = System.currentTimeMillis();
    }

    public static Result success() {
        return new Result(OK, SUCCESS, "success", Collections.emptyMap());
    }

    public static Result success(String message) {
        return new Result(OK, SUCCESS, message, Collections.emptyMap());
    }

    public static Result success(Object data) {
        return new Result(OK, SUCCESS, "success", data);
    }

    public static Result success(String message, Object data) {
        if (data instanceof String || data instanceof Number || data instanceof Boolean || data instanceof Character) {
            throw new IllegalArgumentException("only support JavaBean or Collections.");
        }
        return new Result(OK, SUCCESS, message, data);
    }

    public static Result failure(int code, String message) {
        if (code == SUCCESS) {
            code = FAILED;
        }
        return new Result(ERROR, code, message, Collections.emptyMap());
    }

    public static Result failure(int code, Exception ex) {
        if (code == SUCCESS) {
            code = FAILED;
        }
        return new Result(ERROR, code, ex.getMessage(), Collections.emptyMap());
    }

    public static Result failure(int status, int code, String message) {
        if (code == SUCCESS) {
            code = FAILED;
        }
        return new Result(status, code, message, Collections.emptyMap());
    }

    public boolean isSuccess() {
        return code == SUCCESS;
    }

}
