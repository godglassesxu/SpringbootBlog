package com.xu.spring_boot_blog.service;

import com.xu.spring_boot_blog.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(Long postId,CommentDto commentDto);
}
