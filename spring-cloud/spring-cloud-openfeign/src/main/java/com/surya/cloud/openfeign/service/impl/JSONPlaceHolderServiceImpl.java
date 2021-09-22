package com.surya.cloud.openfeign.service.impl;

import com.surya.cloud.openfeign.client.JSONPlaceHolderClient;
import com.surya.cloud.openfeign.model.Post;
import com.surya.cloud.openfeign.service.JSONPlaceHolderService;
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
