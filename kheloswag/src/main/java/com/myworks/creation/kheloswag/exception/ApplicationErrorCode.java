package com.myworks.creation.kheloswag.exception;

public enum ApplicationErrorCode {
    DUPLICATE_RECORD("001","Record Already Exist"),
    NO_RECORD_IN_DB("002","No Record Found"),
    INVALID_PARAMETERS("003","Request parameters are Invalid");
    private String code;
    private String message;

    ApplicationErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
