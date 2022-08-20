package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginIsolatedPair {
    private String symbol;
    private String symbolName;
    private String baseCurrency;
    private String quoteCurrency;
    private int maxLeverage;
    private BigDecimal flDebtRatio;
    private boolean tradeEnable;
    private BigDecimal autoRenewMaxDebtRatio;
    private boolean baseBorrowEnable;
    private boolean quoteBorrowEnable;
    private boolean baseTransferInEnable;
    private boolean quoteTransferInEnable;
}
