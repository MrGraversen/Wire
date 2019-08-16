package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

public class ServerActionCreated {
    @SerializedName("action")
    private final ServerAction serverAction;

    public ServerActionCreated(ServerAction serverAction) {
        this.serverAction = serverAction;
    }

    public ServerAction getServerAction() {
        return serverAction;
    }
}
