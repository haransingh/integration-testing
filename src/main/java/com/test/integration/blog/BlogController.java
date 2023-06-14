package com.test.integration.blog;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/blog")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO) {
        return blogService.createBlog(blogRequestDTO);
    }

    @GetMapping("/{id}")
    public BlogResponseDTO getBlogById(@PathVariable Long id) {
        return blogService.getBlogById(id);
    }
}
