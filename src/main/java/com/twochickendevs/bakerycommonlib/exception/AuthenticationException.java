package com.twochickendevs.bakerycommonlib.exception;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String reason) {
        super(reason);
    }
}
