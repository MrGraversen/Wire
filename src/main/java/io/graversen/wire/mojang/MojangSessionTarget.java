package io.graversen.wire.mojang;

import io.graversen.wire.util.BaseTarget;
import io.graversen.wire.util.SetApplicationJsonInterceptor;

import java.util.List;

public class MojangSessionTarget extends BaseTarget<MojangSession> {
    private static final Class<MojangSession> TARGET_CLASS = MojangSession.class;
    private static final String TARGET_URL = "https://sessionserver.mojang.com/";

    public MojangSessionTarget() {
        super(
                TARGET_CLASS,
                TARGET_URL,
                List.of(
                        new SetApplicationJsonInterceptor()
                )
        );
    }
}
