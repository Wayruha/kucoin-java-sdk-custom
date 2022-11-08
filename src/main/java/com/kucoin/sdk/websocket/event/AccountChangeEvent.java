/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.websocket.event;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by chenshiwei on 2019/1/23.
 */
@Data
public class AccountChangeEvent {

    private BigDecimal total;

    private BigDecimal available;

    private BigDecimal availableChange;

    private String currency;

    private BigDecimal hold;

    private BigDecimal holdChange;

    private String relationEvent;

    private Map relationContext;

    private String relationEventId;

    private String time;

    private String accountId;

    public static class RelationEventConstants {
        public static final String MAIN_DEPOSIT = "main.deposit";
        public static final String MAIN_WITHDRAW_HOLD = "main.withdraw_hold";
        public static final String MAIN_WITHDRAW_DONE = "main.withdraw_done";
        public static final String MAIN_TRANSFER = "main.transfer";
        public static final String MAIN_OTHER = "main.other";
        public static final String TRADE_HOLD = "trade.hold";
        public static final String TRADE_SETTED = "trade.setted";
        public static final String TRADE_TRANSFER = "trade.transfer";
        public static final String TRADE_OTHER = "trade.other";
        public static final String MARGIN_HOLD = "margin.hold";
        public static final String MARGIN_SETTED = "margin.setted";
        public static final String MARGIN_TRANSFER = "margin.transfer";
        public static final String MARGIN_ORDER = "margin.other";

        private static final String ISOLATED_MARGIN_EVENT_REGEX = "isolated_\\w+-\\w+\\.\\w+";

        public static String parseIsolatedSymbol(String event) {
            if (event.matches(ISOLATED_MARGIN_EVENT_REGEX)) {
                return event.split("_")[1].split("\\.")[0];
            } else return null;
        }
    }
}
