package com.twochickendevs.bakerycommonlib.exception.advide;

import com.twochickendevs.bakerycommonlib.exception.ForbiddenException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ForbiddenExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String forbidden(ForbiddenException ex) {
        return ex.getMessage();
    }
}
