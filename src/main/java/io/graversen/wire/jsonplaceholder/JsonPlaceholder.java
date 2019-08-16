package io.graversen.wire.jsonplaceholder;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface JsonPlaceholder {
    @RequestLine("GET /posts")
    List<Post> posts();

    @RequestLine("GET /posts/{id}")
    Post post(@Param("id") int id);

    @RequestLine("GET /posts/{id}/comments")
    List<Comment> comments(@Param("id") int id);
}
