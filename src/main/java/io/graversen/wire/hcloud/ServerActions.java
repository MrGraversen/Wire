package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServerActions {
    @SerializedName("actions")
    private List<? extends ServerAction> serverActions;

    public ServerActions(List<? extends ServerAction> serverActions) {
        this.serverActions = serverActions;
    }

    public List<? extends ServerAction> getServerActions() {
        return serverActions;
    }
}
