package com.xu.spring_boot_blog.service.impl;

import com.xu.spring_boot_blog.entity.Post;
import com.xu.spring_boot_blog.payload.PostDto;
import com.xu.spring_boot_blog.repository.PostRepository;
import com.xu.spring_boot_blog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        // 1.convert DTO to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        // 2.entity save to repository
        Post newPost = postRepository.save(post);

        // 3.convert entity to DTO
        PostDto postResponse = new PostDto();
        postResponse.setId(newPost.getId());
        postResponse.setDescription(newPost.getDescription());
        postResponse.setContent(newPost.getContent());

        return postResponse;
    }
}
