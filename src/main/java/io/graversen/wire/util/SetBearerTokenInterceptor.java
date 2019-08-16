package io.graversen.wire.util;

import feign.RequestTemplate;

public class SetBearerTokenInterceptor implements RequestTemplateInterceptor {
    private static final String HEADER_NAME = "Authorization";
    private static final String BEARER_TEMPLATE = "Bearer %s";

    private final String authorizationToken;

    public SetBearerTokenInterceptor(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    @Override
    public RequestTemplate apply(RequestTemplate requestTemplate) {
        return requestTemplate.header(HEADER_NAME, String.format(BEARER_TEMPLATE, authorizationToken));
    }
}
