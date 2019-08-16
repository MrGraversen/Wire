package io.graversen.wire.util;

import feign.Feign;
import feign.Logger;
import feign.Target;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

import java.util.Objects;

public abstract class FeignClients {
    public static <T> T simpleGsonClient(Target<T> target) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .encoder(new GsonEncoder())
                .logger(new SystemOutLogger())
                .errorDecoder(new SystemOutErrorDecoder())
                .target(target);
    }

    public static <T> T customGsonClient(Target<T> target, Logger logger, ErrorDecoder errorDecoder) {
        logger = Objects.requireNonNullElseGet(logger, Logger.NoOpLogger::new);
        errorDecoder = Objects.requireNonNullElseGet(errorDecoder, ErrorDecoder.Default::new);

        return Feign.builder()
                .decoder(new GsonDecoder())
                .encoder(new GsonEncoder())
                .logger(logger)
                .errorDecoder(errorDecoder)
                .target(target);
    }
}
