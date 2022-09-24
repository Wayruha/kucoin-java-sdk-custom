package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossMarginRiskLimit {

    private String currency;

    private BigDecimal borrowMaxAmount;

    private BigDecimal buyMaxAmount;

    private int precision;
}
