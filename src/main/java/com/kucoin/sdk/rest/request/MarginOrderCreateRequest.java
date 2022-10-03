/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.request;

import lombok.*;

import java.math.BigDecimal;

/**
 * @since 2018-09-17
 */
@Getter
@Setter
@ToString
public class MarginOrderCreateRequest extends OrderCreateApiRequest {

    @Builder(builderMethodName = "marginBuilder")
    public MarginOrderCreateRequest(String symbol, String type, String side, BigDecimal price, BigDecimal size, BigDecimal funds, String stp, String tradeType, String stop, BigDecimal stopPrice, String timeInForce, long cancelAfter, boolean postOnly, boolean hidden, boolean iceberge, BigDecimal visibleSize, String clientOid, String remark, Boolean autoBorrow, String marginModel) {
        super(symbol, type, side, price, size, funds, stp, tradeType, stop, stopPrice, timeInForce, cancelAfter, postOnly, hidden, iceberge, visibleSize, clientOid, remark);
        this.autoBorrow = autoBorrow;
        this.marginModel = marginModel;
    }

    /**
     *[Optional] Auto-borrow to place order. The system will first borrow you funds at the optimal interest rate
     * and then place an order for you.
     */
    private Boolean autoBorrow;

    /**
     * [Optional] The type of trading, including cross (cross mode) and isolated (isolated mode). It is set at cross by default.
     * The isolated mode will be released soon, so stay tuned!
     */
    private String marginModel = "cross";

}