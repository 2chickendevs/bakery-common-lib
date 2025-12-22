package com.twochickendevs.bakerycommonlib.exception.advide;

import com.twochickendevs.bakerycommonlib.exception.ExistingException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(1)
public class ExistingAdvice {

    @ResponseBody
    @ExceptionHandler(ExistingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String existing(ExistingException ex) {
        return ex.getMessage();
    }
}
