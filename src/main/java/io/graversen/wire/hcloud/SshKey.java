package io.graversen.wire.hcloud;

public class SshKey {
    private final String id;
    private final String name;

    public SshKey(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
