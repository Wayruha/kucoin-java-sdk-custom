package com.kucoin.sdk.rest.interfaces;

import com.kucoin.sdk.rest.response.SupportedNetworkResponse;

import java.io.IOException;
import java.util.List;

/**
 * Not-documented API. Use different endpoint.
 */
public interface InternalAPI {
    /**
     * returns supported network for asset specified.
     * @param asset - if null then return all assets
     */
    List<SupportedNetworkResponse> getSupportedNetworks(String asset) throws IOException;
}