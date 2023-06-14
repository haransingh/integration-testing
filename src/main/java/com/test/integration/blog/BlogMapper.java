package com.test.integration.blog;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.function.Function;

@Service
public class BlogMapper implements Function<BlogRequestDTO, Blog> {
    @Override
    public Blog apply(BlogRequestDTO blogRequestDTO) {
        return new Blog(
                null,
                blogRequestDTO.title(),
                blogRequestDTO.des(),
                LocalDateTime.now(),
                blogRequestDTO.user()
        );
    }
}
