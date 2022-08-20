/**
 * Copyright 2019 Mek Global Limited.
 */

package com.kucoin.sdk.rest.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Created by zicong.lu on 2018/12/14.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KucoinResponse<R> implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String SUCCESS_CODE = "200000";
    private static final List<String> SUCCESS_CODES = List.of("200000", "200");
    protected String code;
    protected String msg;

    private R data;

    public boolean isSuccessful() {
        return SUCCESS_CODES.contains(this.code);
    }

}
