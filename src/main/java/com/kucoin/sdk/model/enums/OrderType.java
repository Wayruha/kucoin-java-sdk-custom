/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 买卖盘订单类型
 * 
 * @author kevinqu
 *
 */
public enum OrderType {

    /**
     * 1 限价单
     */
    @JsonProperty("limit")
    LIMIT("limit"),

    /**
     * 2 市价单
     */
    @JsonProperty("market")
    MARKET("market"),
    @JsonProperty("limit_stop")
    LIMIT_STOP("limit_stop"),
    @JsonProperty("market_stop")
    MARKET_STOP("market_stop");

    private String code;

    OrderType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
