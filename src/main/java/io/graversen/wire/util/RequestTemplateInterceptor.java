package io.graversen.wire.util;

import feign.RequestTemplate;

import java.util.Objects;
import java.util.function.UnaryOperator;

@FunctionalInterface
public interface RequestTemplateInterceptor extends UnaryOperator<RequestTemplate> {
    default <V> RequestTemplateInterceptor then(RequestTemplateInterceptor after) {
        Objects.requireNonNull(after);
        return (RequestTemplate requestTemplate) -> after.apply(apply(requestTemplate));
    }

    static RequestTemplateInterceptor identity() {
        return t -> t;
    }
}
