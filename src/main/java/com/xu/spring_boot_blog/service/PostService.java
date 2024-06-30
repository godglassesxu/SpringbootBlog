package com.xu.spring_boot_blog.service;

import com.xu.spring_boot_blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
