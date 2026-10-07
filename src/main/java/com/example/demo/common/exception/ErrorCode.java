package com.example.demo.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    //User
    USER_NOT_FOUND(HttpStatus.NOT_FOUND,"user_000","존재하지 않은 사용자"),

    //product
    INVALID_PARAMETER(HttpStatus.BAD_REQUEST,"product_000","잘못된 파라미터 요청"),
    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND,"product_001","존재하지 않은 상품"),

    INVALID_AMOUNT(HttpStatus.BAD_REQUEST,"point_000","충전금액은 1원 이상이어야 합니다");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
