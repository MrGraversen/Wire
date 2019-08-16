package io.graversen.wire.util;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;

import java.util.List;
import java.util.Objects;

public abstract class BaseTarget<T> extends Target.HardCodedTarget<T> {
    private final List<RequestTemplateInterceptor> requestTemplateInterceptors;
    private final RequestTemplateInterceptor compiledInterceptor;

    protected BaseTarget(Class<T> type, String url) {
        this(type, url, List.of());
    }

    public BaseTarget(Class<T> type, String url, RequestTemplateInterceptor requestTemplateInterceptor) {
        this(type, url, List.of(requestTemplateInterceptor));
    }

    public BaseTarget(Class<T> type, String url, List<RequestTemplateInterceptor> requestTemplateInterceptors) {
        super(type, url);
        this.requestTemplateInterceptors = requestTemplateInterceptors;
        this.compiledInterceptor = requestTemplateInterceptors.stream()
                .reduce(RequestTemplateInterceptor.identity(), RequestTemplateInterceptor::then);
    }

    @Override
    public Request apply(RequestTemplate input) {
        if (Objects.nonNull(compiledInterceptor)) {
            input = compiledInterceptor.apply(input);
        }

        return super.apply(input);
    }
}
