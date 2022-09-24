/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.interfaces.retrofit;

import com.kucoin.sdk.rest.request.MarginOrderCreateRequest;
import com.kucoin.sdk.rest.response.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by ezreal on 2020/12/08.
 */
public interface MarginAPIRetrofit {

    @GET("api/v1/mark-price/{symbol}/current")
    Call<KucoinResponse<MarkPriceResponse>> getMarkPrice(@Path("symbol") String symbol);

    @GET("api/v1/margin/config")
    Call<KucoinResponse<MarginConfigResponse>> getMarginConfig();

    @GET("api/v1/margin/account")
    Call<KucoinResponse<MarginAccountResponse>> getMarginAccount();

    @POST("api/v1/margin/order")
    Call<KucoinResponse<MarginOrderCreateResponse>> createMarginOrder(@Body MarginOrderCreateRequest request);

    @GET("/api/v1/risk/limit/strategy?marginModel=cross")
    Call<KucoinResponse<CrossMarginPriceStrategyResponse>> getCrossMarginPriceStrategy();

    @GET("/api/v1/risk/limit/strategy?marginModel=isolated")
    Call<KucoinResponse<IsolatedMarginPriceStrategyResponse>> getIsolatedMarginPriceStrategy();

    @GET("api/v1/isolated/symbols")
    Call<KucoinResponse<List<MarginIsolatedPair>>> getIsolatedMarginSymbolsInfo();

    @GET("api/v1/isolated/account/{symbol")
    Call<KucoinResponse<MarginIsolatedPair>> getIsolatedAccount(@Path("symbol") String symbol);

    @GET("api/v1/isolated/accounts")
    Call<KucoinResponse<IsolatedMarginAccount>> getIsolatedAccount();
}
