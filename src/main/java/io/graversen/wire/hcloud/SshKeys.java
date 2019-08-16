package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SshKeys {
    @SerializedName("ssh_keys")
    private final List<? extends SshKey> sshKeys;

    public SshKeys(List<SshKey> sshKeys) {
        this.sshKeys = sshKeys;
    }

    public List<? extends SshKey> getSshKeys() {
        return sshKeys;
    }
}
