package com.kucoin.sdk.rest.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class IsolatedQuickRepaymentRequest {
    private String currency;

    private String symbol;

    private BigDecimal size;

    private RepaySeqStrategy seqStrategy;
}
