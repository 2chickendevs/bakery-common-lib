package com.twochickendevs.bakerycommonlib.exception.advide;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.security.authorization.AuthorizationDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(1)
public class AuthorizationDeniedExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(AuthorizationDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String authorizationDeniedException(AuthorizationDeniedException ex) {
        return ex.getMessage();
    }
}
