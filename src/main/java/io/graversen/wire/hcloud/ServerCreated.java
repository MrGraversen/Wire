package io.graversen.wire.hcloud;

public class ServerCreated {
    private final Server server;

    public ServerCreated(Server server) {
        this.server = server;
    }

    public Server getServer() {
        return server;
    }
}
