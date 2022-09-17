package com.kucoin.sdk.rest.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class IsolatedMarginBorrowRequest {
    private String symbol;
    private String currency;
    private BigDecimal size;
    //FOK (fill-or-kill) or IOK (immediate-or-kill)
    private String borrowStrategy;

    //optional
    private BigDecimal maxRate;
    private String period;

    @Builder
    public IsolatedMarginBorrowRequest(String symbol, String currency, BigDecimal size, String borrowStrategy, BigDecimal maxRate, String period) {
        this.symbol = symbol;
        this.currency = currency;
        this.size = size;
        this.borrowStrategy = borrowStrategy;
        this.maxRate = maxRate;
        this.period = period;
    }
}
