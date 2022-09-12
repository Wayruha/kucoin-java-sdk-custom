package com.kucoin.sdk.rest.adapter;

import com.kucoin.sdk.rest.impl.retrofit.PublicRetrofitAPIImpl;
import com.kucoin.sdk.rest.interfaces.InternalAPI;
import com.kucoin.sdk.rest.interfaces.retrofit.InternalAPIRetrofit;
import com.kucoin.sdk.rest.response.SupportedNetworkResponse;

import java.io.IOException;
import java.util.List;

public class InternalAPIAdapter extends PublicRetrofitAPIImpl<InternalAPIRetrofit> implements InternalAPI {
    public InternalAPIAdapter(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public List<SupportedNetworkResponse> getSupportedNetworks(String asset) throws IOException {
        return executeSync(getAPIImpl().getSupportedNetworks(asset));
    }
}