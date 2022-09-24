package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsolatedMarginRiskLimit {
    private String symbol;
    private BigDecimal baseMaxBorrowAmount;
    private BigDecimal quoteMaxBorrowAmount;
    private BigDecimal baseMaxBuyAmount;
    private BigDecimal quoteMaxBuyAmount;
    private BigDecimal baseMaxHoldAmount;
    private BigDecimal quoteMaxHoldAmount;
    private int basePrecision;
    private int quotePrecision;
}
