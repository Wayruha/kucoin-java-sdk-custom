package com.kucoin.sdk.rest.interfaces.retrofit;

import com.kucoin.sdk.rest.response.KucoinResponse;
import com.kucoin.sdk.rest.response.LoanCurrencyResponse;
import com.kucoin.sdk.rest.response.MarginBorrowInfo;
import com.kucoin.sdk.rest.response.SupportedNetworkResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface InternalAPIRetrofit {
    @GET("_api/currency/currency/chain-info")
    Call<KucoinResponse<List<SupportedNetworkResponse>>> getSupportedNetworks(@Query("currency") String asset);

    @GET("_api/margin-isolated-position/position/position-by-tag-direct")
    Call<KucoinResponse<MarginBorrowInfo>> getMarginBorrowInfo(@Query("tag") String symbol, @Query("c") String creds);

    @GET("_api/margin-config/loan-currencies")
    Call<KucoinResponse<List<LoanCurrencyResponse>>> getLoanInfo();
}