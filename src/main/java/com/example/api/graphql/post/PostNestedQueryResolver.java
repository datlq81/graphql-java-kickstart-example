package com.example.api.graphql.post;

import com.example.api.dto.Comment;
import com.example.api.dto.Post;
import com.example.api.dto.User;
import com.example.api.service.CommentService;
import com.example.api.service.UserService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class PostNestedQueryResolver implements GraphQLResolver<Post> {

    private final CommentService commentService;
    private final UserService userService;

    CompletableFuture<List<Comment>> comments(Post post) {
        return CompletableFuture.supplyAsync(() -> commentService.getAllCommentsByPostId(post.getId()));
    }

    CompletableFuture<User> user(Post post) {
        return CompletableFuture.supplyAsync(() -> userService.getUserById(post.getUserId()));
    }
}
