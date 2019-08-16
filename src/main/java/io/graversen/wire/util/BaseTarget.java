package io.graversen.wire.util;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;

import java.util.Objects;
import java.util.function.UnaryOperator;

public abstract class BaseTarget<T> extends Target.HardCodedTarget<T> {
    private final RequestTemplateInterceptor requestTemplateInterceptor;

    protected BaseTarget(Class<T> type, String url) {
        super(type, url);
        this.requestTemplateInterceptor = null;
    }

    public BaseTarget(Class<T> type, String url, RequestTemplateInterceptor requestTemplateInterceptor) {
        super(type, url);
        this.requestTemplateInterceptor = requestTemplateInterceptor;
    }

    @Override
    public Request apply(RequestTemplate input) {
        if (Objects.nonNull(requestTemplateInterceptor)) {
            input = requestTemplateInterceptor.apply(input);
        }

        return super.apply(input);
    }
}
