package io.graversen.wire.mojang;

import io.graversen.wire.util.BaseTarget;
import io.graversen.wire.util.SetApplicationJsonInterceptor;

import java.util.List;

public class MojangTarget extends BaseTarget<Mojang> {
    private static final Class<Mojang> TARGET_CLASS = Mojang.class;
    private static final String TARGET_URL = "https://api.mojang.com/";

    public MojangTarget() {
        super(
                TARGET_CLASS,
                TARGET_URL,
                List.of(
                        new SetApplicationJsonInterceptor()
                )
        );
    }
}
