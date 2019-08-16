package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class CreateServer {
    private final String name;
    @SerializedName("server_type")
    private final String serverType;
    private final String image;
    private final String location;
    @SerializedName("user_data")
    private final String userData;
    private final Map<String, String> labels;
    @SerializedName("ssh_keys")
    private final List<String> sshKeys;

    public CreateServer(String name, String serverType, String image, String location, String userData, Map<String, String> labels, List<String> sshKeys) {
        this.name = name;
        this.serverType = serverType;
        this.image = image;
        this.location = location;
        this.userData = userData;
        this.labels = labels;
        this.sshKeys = sshKeys;
    }
}
