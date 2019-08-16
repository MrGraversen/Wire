package io.graversen.wire.hcloud;

import feign.RequestLine;

public interface HetznerCloud {
    @RequestLine("GET /servers")
    Servers servers();

    @RequestLine("POST /servers")
    ServerCreated create(CreateServer createServer);
}
