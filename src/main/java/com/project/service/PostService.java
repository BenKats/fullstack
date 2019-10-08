package com.project.service;

import com.project.model.Post;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PostService {

    Post createPost(Post newPost, String username);

    List<Post> listPosts(String username);

    HttpStatus deleteById(Long postId);

    public Iterable<Post> listAllPosts();
}
