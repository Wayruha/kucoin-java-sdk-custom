package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsolatedMarginAccountV3 {
  private BigDecimal totalAssetOfQuoteCurrency;
  private BigDecimal totalLiabilityOfQuoteCurrency;
  private List<IsolatedMarginAccountPairV3> assets;
}
