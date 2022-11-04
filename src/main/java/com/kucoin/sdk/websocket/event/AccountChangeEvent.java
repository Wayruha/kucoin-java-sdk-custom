/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.websocket.event;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import lombok.Data;
import lombok.Getter;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
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

    private RelationEvent relationEvent;

    private Map relationContext;

    private String relationEventId;

    private String time;

    private String accountId;

    @JsonDeserialize(using = RelationEventDeserializer.class)
    public enum RelationEvent {
        MAIN_DEPOSIT("main.deposit"),
        MAIN_WITHDRAW_HOLD("main.withdraw_hold"),
        MAIN_WITHDRAW_DONE("main.withdraw_done"),
        MAIN_TRANSFER("main.transfer"),
        MAIN_OTHER("main.other"),
        TRADE_HOLD("trade.hold"),
        TRADE_SETTED("trade.setted"),
        TRADE_TRANSFER("trade.transfer"),
        TRADE_OTHER("trade.other"),
        MARGIN_HOLD("margin.hold"),
        MARGIN_SETTED("margin.setted"),
        MARGIN_TRANSFER("margin.transfer"),
        MARGIN_ORDER("margin.other"),
        OTHER("other");

        @Getter
        private String code;

        RelationEvent(String code) {
            this.code = code;
        }

        public static RelationEvent fromCode(String code) {
            return Arrays.stream(values()).filter(v -> v.getCode().equals(code)).findAny().orElse(null);
        }
    }

    public static class RelationEventDeserializer extends StdDeserializer<RelationEvent> {
        protected RelationEventDeserializer() {
            super(RelationEvent.class);
        }

        @Override
        public RelationEvent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return RelationEvent.fromCode(p.getText());
        }
    }

}
