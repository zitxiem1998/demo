package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;


public interface BlogService {
    Iterable<Blog> findAll();

    Iterable<Blog> findAllByCategory(Category category);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
