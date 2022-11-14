package com.kucoin.sdk;

import com.kucoin.sdk.exception.KucoinApiException;
import com.kucoin.sdk.model.enums.PrivateChannelEnum;
import com.kucoin.sdk.websocket.KucoinAPICallback;
import com.kucoin.sdk.websocket.event.KucoinEvent;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
class TestCallback<T> implements KucoinAPICallback<KucoinEvent<T>> {
    private final AtomicReference event;
    private final CountDownLatch eventCounter;

    public TestCallback(AtomicReference event, CountDownLatch eventCounter) {
        this.event = event;
        this.eventCounter = eventCounter;
    }

    @Override
    public void onResponse(KucoinEvent response) throws KucoinApiException {
        log.info("Got response");
        event.set(response.getData());
        //TODO need to unsubscribe for a clean tests
        log.warn("NOT IMPLEMENTED: need to unsubscribe for a clean tests");
        eventCounter.countDown();
    }

    @Override
    public void onFailure(Throwable cause) {
        System.out.println("WS connection failed. Reconnecting. cause:" + cause.getMessage());
        //reinitializeWSConnection();	//implement this method
    }
}
