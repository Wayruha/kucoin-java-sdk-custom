package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kucoin.sdk.model.enums.AssetStatus;
import com.kucoin.sdk.model.enums.AssetStatusV3;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsolatedMarginAccountPairV3 {
    private String symbol;
    private AssetStatusV3 status;
    private BigDecimal debtRatio;
    private MarginAccountV3 baseAsset;
    private MarginAccountV3 quoteAsset;
}
