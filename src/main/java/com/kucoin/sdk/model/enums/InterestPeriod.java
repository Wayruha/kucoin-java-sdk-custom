package com.kucoin.sdk.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Arrays;

public enum InterestPeriod {
    _7DAYS(7),
    _14DAYS(14),
    _28DAYS(28);

    private final int days;

    @JsonCreator
    public static InterestPeriod forValue(int days) {
        return Arrays.stream(values()).filter(val -> val.days == days).findFirst().orElseThrow();
    }

    InterestPeriod(int days) {
        this.days = days;
    }
}
