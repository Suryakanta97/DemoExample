package com.surya.cloud.openfeign.hystrix;

import com.surya.cloud.openfeign.client.JSONPlaceHolderClient;
import com.surya.cloud.openfeign.model.Post;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {

    @Override
    public List<Post> getPosts() {
        return Collections.emptyList();
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }
}
