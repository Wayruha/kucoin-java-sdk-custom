package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kucoin.sdk.model.enums.InterestPeriod;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanCurrencyResponse {
    private String currency;
    private String currencyName;
    private BigDecimal currencyLoanMinUnit;
    private BigDecimal lendMaxAmount;
    private BigDecimal lendMinAmount;
    private BigDecimal borrowMinAmount;
    private BigDecimal maxInterestRate;
    private BigDecimal minInterestRate;
    private BigDecimal interestRateUnit;
    private List<InterestPeriod> period;
    private BigDecimal riskFundsRate;
    private BigDecimal feeRatio;
    private String domainId;
    private String sort;
    private long createdAt;
    private int precision;
    private String iconUrl;
    private boolean marginBorrowEnabled;
    private boolean isolatedBorrowEnabled;
    private boolean lendEnabled;
}
