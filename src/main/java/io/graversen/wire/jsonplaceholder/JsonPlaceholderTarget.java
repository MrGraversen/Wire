package io.graversen.wire.jsonplaceholder;

import feign.Target;

public abstract class JsonPlaceholderTarget {
    public static Target<JsonPlaceholder> instance() {
        return new Target.HardCodedTarget<>(JsonPlaceholder.class, "https://jsonplaceholder.typicode.com");
    }
}
