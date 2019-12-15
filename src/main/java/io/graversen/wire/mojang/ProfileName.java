package io.graversen.wire.mojang;

public class ProfileName {
    private final String name;
    private final long changedToAt;

    public ProfileName(String name, long changedToAt) {
        this.name = name;
        this.changedToAt = changedToAt;
    }

    public String getName() {
        return name;
    }

    public long getChangedToAt() {
        return changedToAt;
    }
}
