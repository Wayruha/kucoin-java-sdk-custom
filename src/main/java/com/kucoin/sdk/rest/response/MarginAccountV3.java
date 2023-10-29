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

    private BigDecimal totalBalance;

    private BigDecimal availableBalance;

    private BigDecimal holdBalance;

    private BigDecimal liability;

    private BigDecimal borrowableAmount;

    private BigDecimal interest;

    private BigDecimal maxBorrowSize;
}
