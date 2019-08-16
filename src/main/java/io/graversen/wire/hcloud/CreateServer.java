package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

public class CreateServer {
    private final String name;
    @SerializedName("server_type")
    private final String serverType;
    private final String image;

    public CreateServer(String name, String serverType, String image) {
        this.name = name;
        this.serverType = serverType;
        this.image = image;
    }
}
