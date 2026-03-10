package com.twochickendevs.bakerycommonlib.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private int status;
    private T data;
}