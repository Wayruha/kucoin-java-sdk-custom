package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsolatedMarginAccount {
    BigDecimal totalConversionBalance;
    BigDecimal liabilityConversionBalance;
    List<IsolatedMarginAccountPair> assets;
}
