package com.xu.spring_boot_blog.repository;

import com.xu.spring_boot_blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
