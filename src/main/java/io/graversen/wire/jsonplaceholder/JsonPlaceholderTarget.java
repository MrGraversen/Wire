package io.graversen.wire.jsonplaceholder;

import io.graversen.wire.util.BaseTarget;

public class JsonPlaceholderTarget extends BaseTarget<JsonPlaceholder> {
    private static final Class<JsonPlaceholder> TARGET_CLASS = JsonPlaceholder.class;
    private static final String TARGET_URL = "https://jsonplaceholder.typicode.com/";

    public JsonPlaceholderTarget() {
        super(TARGET_CLASS, TARGET_URL);
    }
}
