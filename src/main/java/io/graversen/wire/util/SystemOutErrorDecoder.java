package io.graversen.wire.util;

import feign.Response;
import feign.codec.ErrorDecoder;

import java.time.LocalDateTime;

public class SystemOutErrorDecoder implements ErrorDecoder {
    private static final String TEMPLATE = "[Feign - %s]: %s%n";
    private final ErrorDecoder wrappedDecoder;

    public SystemOutErrorDecoder() {
        this.wrappedDecoder = new ErrorDecoder.Default();
    }

    @Override
    public Exception decode(String methodKey, Response response) {
        System.err.format(TEMPLATE, LocalDateTime.now(), String.format("%s - HTTP %d", methodKey, response.status()));
        return wrappedDecoder.decode(methodKey, response);
    }
}
