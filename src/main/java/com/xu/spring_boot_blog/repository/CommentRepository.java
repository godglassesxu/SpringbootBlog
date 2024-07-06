package com.xu.spring_boot_blog.repository;

import com.xu.spring_boot_blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
