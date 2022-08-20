package com.kucoin.sdk.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SupportedNetworkResponse {
    private String currency;
    private String chainName;
    private String chain;
    private String chainFullName;
    private boolean isChainEnabled;
    private boolean isDepositEnabled;
    private boolean isWithdrawEnabled;
    private String status;
    private BigDecimal withdrawFeeRate;
    private BigDecimal withdrawMinFee;
    private BigDecimal withdrawMinSize;
    private Integer walletPrecision;
    private String withdrawDisabledTip;
    private String depositDisabledTip;
    private Boolean preDepositTipEnabled;
    private Boolean preWithdrawTipEnabled;
    private String orgAddress;
    private String userAddressName;
    private String txUrl;
    private Integer confirmationCount;
    private String preDepositTip;
    private String preWithdrawTip;

    public void setIsChainEnabled(String chainEnabled) {
        isChainEnabled = Boolean.parseBoolean(chainEnabled);
    }

    public void setIsDepositEnabled(String depositEnabled) {
        isDepositEnabled = Boolean.parseBoolean(depositEnabled);
    }

    public void setIsWithdrawEnabled(String withdrawEnabled) {
        isWithdrawEnabled = Boolean.parseBoolean(withdrawEnabled);
    }
}
