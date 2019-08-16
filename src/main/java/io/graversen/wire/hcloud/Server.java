package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

public class Server {
    private final int id;
    private final String name;
    private final String status;
    private final String created;
    @SerializedName("public_net")
    private final PublicNet publicNet;

    public Server(int id, String name, String status, String created, PublicNet publicNet) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.created = created;
        this.publicNet = publicNet;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getCreated() {
        return created;
    }

    public PublicNet getPublicNet() {
        return publicNet;
    }
}
