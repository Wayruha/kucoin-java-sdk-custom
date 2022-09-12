package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kucoin.sdk.model.enums.AssetStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsolatedMarginAccountPair {
    private String symbol;
    private AssetStatus status;
    private BigDecimal debtRatio;
    private MarginAccount baseAsset;
    private MarginAccount quoteAsset;
}
