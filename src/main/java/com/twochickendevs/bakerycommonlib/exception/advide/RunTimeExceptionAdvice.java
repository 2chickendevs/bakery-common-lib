package com.twochickendevs.bakerycommonlib.exception.advide;

import com.twochickendevs.bakerycommonlib.exception.ExistingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RunTimeExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String existing(RuntimeException ex) {
        return ex.getMessage();
    }
}
