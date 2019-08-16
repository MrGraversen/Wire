package io.graversen.wire.util;

import feign.RequestTemplate;

import java.util.function.UnaryOperator;

@FunctionalInterface
public interface RequestTemplateInterceptor extends UnaryOperator<RequestTemplate> {

}
