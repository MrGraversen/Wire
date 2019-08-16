package io.graversen.wire.hcloud;

import feign.Param;
import feign.RequestLine;

public interface HetznerCloud {
    @RequestLine("GET /servers")
    Servers servers();

    @RequestLine("GET /servers/{id}/actions")
    ServerActions serverActions(@Param("id") int id);

    @RequestLine("POST /servers")
    ServerCreated create(CreateServer createServer);

    @RequestLine("GET /ssh_keys")
    SshKeys sshKeys();
}
