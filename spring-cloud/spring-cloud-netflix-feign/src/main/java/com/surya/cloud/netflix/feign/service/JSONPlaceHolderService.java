package com.surya.cloud.netflix.feign.service;

import com.surya.cloud.netflix.feign.model.Post;

import java.util.List;

public interface JSONPlaceHolderService {

    List<Post> getPosts();

    Post getPostById(Long id);
}
