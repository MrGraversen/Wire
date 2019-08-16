package io.graversen.wire.util;

import feign.Logger;

import java.time.LocalDateTime;

public class SystemOutLogger extends Logger {
    private static final String TEMPLATE = "[Feign - %s]: %s%n";

    @Override
    protected void log(String configKey, String format, Object... args) {
        System.out.format(TEMPLATE, LocalDateTime.now().toString(), format);
    }
}
