package io.graversen.wire.mojang;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface Mojang {
    @RequestLine("GET /user/profiles/{uuid}/names")
    List<ProfileName> profileNames(@Param("uuid") String uuid);

    @RequestLine("GET /users/profiles/minecraft/{username}?at={timestamp}")
    Profile profile(@Param("username") String username, @Param("timestamp") long timestamp);
}
