package com.test.integration.blog;

import java.util.List;

public interface BlogService {
    BlogResponseDTO createBlog(BlogRequestDTO blogRequestDTO);
    BlogResponseDTO getBlogById(Long id);
    BlogResponseDTO updateBlog(Long id, BlogRequestDTO blogRequestDTO);
    List<BlogResponseDTO> getAllBlogs();
    void deleteBlog(Long id);
}
