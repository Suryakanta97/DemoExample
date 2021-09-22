package com.surya.cloud.openfeign.service;

import com.surya.cloud.openfeign.model.Post;

import java.util.List;

public interface JSONPlaceHolderService {

    List<Post> getPosts();

    Post getPostById(Long id);
}
