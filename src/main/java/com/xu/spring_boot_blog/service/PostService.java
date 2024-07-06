package com.xu.spring_boot_blog.service;

import com.xu.spring_boot_blog.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts(int pageNo, int pageSize);

    PostDto getPostById(long id);

    PostDto updatPost(PostDto postDto,long id);

    void deletePostById(long id);
}
