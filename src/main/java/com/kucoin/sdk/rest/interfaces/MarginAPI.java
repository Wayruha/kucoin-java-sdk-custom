/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.interfaces;

import com.kucoin.sdk.rest.request.MarginOrderCreateRequest;
import com.kucoin.sdk.rest.response.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by ezreal on 2020/12/08.
 */
public interface MarginAPI {

    /**
     * Get Mark Price
     * <p>
     * Request via this endpoint to get the index price of the specified symbol.
     * </p>
     * @param symbol
     * @return
     */
    MarkPriceResponse getMarkPrice(String symbol) throws IOException;

    /**
     * Get Margin Configuration Info
     * <p>
     * Request via this endpoint to get the configure info of the margin.
     * </p>
     * @return
     */
    MarginConfigResponse getMarginConfig() throws IOException;

    /**
     * Get Margin Account
     * <p>
     * Request via this endpoint to get the info of the margin account.
     * </p>
     * @return
     */
    MarginAccountResponse getMarginAccount() throws IOException;

    /**
     * You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds.
     * Once an order is placed, your account funds will be put on hold for the duration of the order.
     * How much and which funds are put on hold depends on the order type and parameters specified. See the Holds details below.
     * @param request
     * @return
     */
    MarginOrderCreateResponse createMarginOrder(MarginOrderCreateRequest request) throws IOException;

    /**
     *  Get Cross Margin Price Strategy
     * @return
     */
    List<CrossMarginRiskLimit> getCrossMarginPriceStrategy() throws IOException;

    /**
     *  Get Isolated Margin Price Strategy
     * @return
     */
    List<IsolatedMarginRiskLimit> getIsolatedMarginPriceStrategy() throws IOException;

    List<MarginIsolatedPair> getMarginIsolatedPairsInfo() throws IOException;

    MarginIsolatedPair getMarginIsolatedPairInfo(String symbol) throws IOException;

    IsolatedMarginAccount getIsolatedMarginAccount() throws IOException;

    IsolatedMarginAccountV3 getIsolatedMarginAccountV3() throws IOException;
}
