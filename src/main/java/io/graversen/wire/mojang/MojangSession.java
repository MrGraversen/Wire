package io.graversen.wire.mojang;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface MojangSession {
    @RequestLine("GET /session/minecraft/profile/{uuid}")
    ExtendedProfile profile(@Param("uuid") String uuid);
}
