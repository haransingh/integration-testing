package com.test.integration.blog;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class BlogResponseDTOMapper implements Function<Blog, BlogResponseDTO> {
    @Override
    public BlogResponseDTO apply(Blog blog) {
        return new BlogResponseDTO(
                blog.getId(),
                blog.getTitle(),
                blog.getDes(),
                blog.getDate()
        );
    }
}
