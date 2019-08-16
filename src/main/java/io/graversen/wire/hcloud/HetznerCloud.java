package io.graversen.wire.hcloud;

import feign.Param;
import feign.RequestLine;

public interface HetznerCloud {
    @RequestLine("GET /servers")
    Servers servers();

    @RequestLine("DELETE /servers/{id}")
    void deleteServer(@Param("id") int id);

    @RequestLine("GET /servers/{id}/actions")
    ServerActions serverActions(@Param("id") int id);

    @RequestLine("POST /servers/{id}/actions/reboot")
    ServerActionCreated serverReboot(@Param("id") int id);

    @RequestLine("POST /servers/{id}/actions/reset")
    ServerActionCreated serverReset(@Param("id") int id);

    @RequestLine("POST /servers/{id}/actions/shutdown")
    ServerActionCreated serverShutdown(@Param("id") int id);

    @RequestLine("POST /servers/{id}/actions/poweron")
    ServerActionCreated serverPowerOn(@Param("id") int id);

    @RequestLine("POST /servers")
    ServerCreated create(CreateServer createServer);

    @RequestLine("GET /ssh_keys")
    SshKeys sshKeys();
}
