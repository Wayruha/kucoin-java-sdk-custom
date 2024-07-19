/*
 * Copyright (c) 2019 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginAccountV3 {
    private String currency;

    private boolean borrowEnabled;

    private boolean repayEnabled;

    private boolean transferEnabled;

    private BigDecimal borrowed;

    private BigDecimal totalAsset;

    private BigDecimal available;

    private BigDecimal hold;

    private BigDecimal maxBorrowSize;
}
