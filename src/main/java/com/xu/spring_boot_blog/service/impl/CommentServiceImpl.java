package com.xu.spring_boot_blog.service.impl;

import com.xu.spring_boot_blog.entity.Comment;
import com.xu.spring_boot_blog.entity.Post;
import com.xu.spring_boot_blog.exception.ResourceNotFoundException;
import com.xu.spring_boot_blog.payload.CommentDto;
import com.xu.spring_boot_blog.payload.PostDto;
import com.xu.spring_boot_blog.repository.CommentRepository;
import com.xu.spring_boot_blog.repository.PostRepository;
import com.xu.spring_boot_blog.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {

        Comment comment = mapToENtity(commentDto);

        //retrieve post entity by 8id
        Post post = postRepository.findById(postId).orElseThrow(
                ()-> new ResourceNotFoundException("Post","id",postId));

        //set post to comment entity
        comment.setPost(post);

        //comment entity to DB
        Comment newComment = commentRepository.save(comment);

        return mapToDTO(newComment);
    }



    //    convert Entity into DTO
    private CommentDto mapToDTO(Comment comment){
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setName(comment.getName());
        commentDto.setEmail(comment.getEmail());
        commentDto.setBody(comment.getBody());
        return  commentDto;
    }
    //  convert DTO to entity
    private Comment mapToENtity(CommentDto commentDto){
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());
        return  comment;
    }

}
