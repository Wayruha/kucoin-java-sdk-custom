package com.kucoin.sdk.rest.interfaces.retrofit;

import com.kucoin.sdk.rest.response.KucoinResponse;
import com.kucoin.sdk.rest.response.SupportedNetworkResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface InternalAPIRetrofit {
    @GET("_api/currency/currency/chain-info")
    Call<KucoinResponse<List<SupportedNetworkResponse>>> getSupportedNetworks(@Query("currency") String asset);
}