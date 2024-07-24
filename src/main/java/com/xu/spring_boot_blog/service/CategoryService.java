package com.xu.spring_boot_blog.service;

import com.xu.spring_boot_blog.payload.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto crateCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(Long categoryId);

    List<CategoryDto> getAllCategories();

    CategoryDto updateCategory(CategoryDto categoryDto, Long categoryId);

    void deleteCategory(Long categoryId);
}
