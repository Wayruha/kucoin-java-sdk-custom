package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kucoin.sdk.model.enums.AssetStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginBorrowInfo {
    private String type; //"ISOLATED
    @JsonProperty("tag")
    private String symbol;
    private AssetStatus status;
    private String statusBizType;
    private String statusRecId;
    private Boolean isAutoRepay;
    private int userLeverage;
    private BigDecimal accumulatedPrincipal;
    private BigDecimal totalConversionBalance;
    private BigDecimal liabilityConversionBalance;
    private String riskGrade;
    private AssetInfo baseAsset;
    private AssetInfo quoteAsset;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AssetInfo {
        private String currency;
        private BigDecimal markPrice;
        private BigDecimal totalBalance;
        private BigDecimal holdBalance;
        private BigDecimal liabilityPrincipal;
        private BigDecimal liabilityInterest;
        private BigDecimal borrowAmount;
        private BigDecimal borrowUnit;
    }
}
