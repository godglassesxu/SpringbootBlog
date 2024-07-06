package com.xu.spring_boot_blog.repository;

import com.xu.spring_boot_blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository include CRUD method @Repository
//Post的KEY 型態為Long
public interface PostRepository extends JpaRepository<Post,Long> {
}
