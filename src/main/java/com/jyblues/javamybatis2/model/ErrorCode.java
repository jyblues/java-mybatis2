package com.jyblues.javamybatis2.model;

import lombok.Getter;

@Getter
public enum ErrorCode {
    OK(0, "Ok"),
    FAILURE(-1, "Failure"),
    UNKNOWN(-2, "Unknown"),
    NOT_FOUND(1, "Not Found"),
    ALREADY_EXISTS(2, "Already Exists"),
    INVALID(3, "Invalid"),
    SAME_VALUE(4, "Same Password"),
    INVALID_PASSWORD(5, "Invalid Password");


    private int code;
    private String detail;

    ErrorCode(int code, String detail) {
        this.code = code;
        this.detail = detail;
    }
}
