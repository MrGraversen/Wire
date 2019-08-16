package io.graversen.wire.hcloud;

import java.util.List;

public class Servers {
    private final List<? extends Server> servers;

    public Servers(List<? extends Server> servers) {
        this.servers = servers;
    }

    public List<? extends Server> getServers() {
        return servers;
    }
}
