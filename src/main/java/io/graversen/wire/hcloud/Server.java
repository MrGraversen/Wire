package io.graversen.wire.hcloud;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Server {
    private final int id;
    private final String name;
    private final String status;
    private final String created;
    private final Map<String, String> labels;
    @SerializedName("public_net")
    private final PublicNet publicNet;

    public Server(int id, String name, String status, String created, Map<String, String> labels, PublicNet publicNet) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.created = created;
        this.labels = labels;
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

    public Map<String, String> getLabels() {
        return labels;
    }

    public PublicNet getPublicNet() {
        return publicNet;
    }
}
