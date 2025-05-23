package com.milesight.beaveriot.mqtt.broker.bridge.adapter.emqx.model;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmqxAcl {

    @NotNull
    private String username;

    @NotNull
    private List<Rule> rules;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rule {

        @NotNull
        private Action action;

        @NotNull
        private String topic;

        @NotNull
        private Permission permission;

        private List<Integer> qos;

        private Boolean retain;

    }

    public enum Action {
        SUBSCRIBE,
        PUBLISH,
        ALL,
        ;

        @JsonValue
        public String value() {
            return this.name().toLowerCase();
        }
    }

    public enum Permission {
        ALLOW,
        DENY,
        ;

        @JsonValue
        public String value() {
            return this.name().toLowerCase();
        }
    }

}
