package io.graversen.wire.util;

import feign.RequestTemplate;

public class SetApplicationJsonInterceptor implements RequestTemplateInterceptor {
    private static final String HEADER_NAME = "Content-Type";
    private static final String HEADER_VALUE = "application/json";

    @Override
    public RequestTemplate apply(RequestTemplate requestTemplate) {
        return requestTemplate.header(HEADER_NAME, HEADER_VALUE);
    }
}
