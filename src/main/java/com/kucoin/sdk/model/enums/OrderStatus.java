package com.kucoin.sdk.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderStatus {
    @JsonProperty("active")
    ACTIVE("active"),
    @JsonProperty("done")
    DONE("done");

    private String code;

    OrderStatus(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
