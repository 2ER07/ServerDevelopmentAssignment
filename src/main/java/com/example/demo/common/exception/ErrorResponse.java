package com.example.demo.common.exception;

public record ErrorResponse(String errorCode, String message) {
    public static ErrorResponse of(ErrorCode errorCode){
        return new ErrorResponse(errorCode.getCode(),errorCode.getMessage());
    }
}
