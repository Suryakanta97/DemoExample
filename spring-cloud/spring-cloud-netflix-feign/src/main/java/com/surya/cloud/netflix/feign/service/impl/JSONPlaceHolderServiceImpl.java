package com.surya.cloud.netflix.feign.service.impl;

import com.surya.cloud.netflix.feign.client.JSONPlaceHolderClient;
import com.surya.cloud.netflix.feign.model.Post;
import com.surya.cloud.netflix.feign.service.JSONPlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JSONPlaceHolderServiceImpl implements JSONPlaceHolderService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    @Override
    public Post getPostById(Long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }
}
