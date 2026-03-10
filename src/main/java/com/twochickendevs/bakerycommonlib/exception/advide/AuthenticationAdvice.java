package com.twochickendevs.bakerycommonlib.exception.advide;

import com.twochickendevs.bakerycommonlib.exception.AuthenticationException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(1)
public class AuthenticationAdvice {

    @ResponseBody
    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String authenticateFail(AuthenticationException ex) {
        return ex.getMessage();
    }
}
