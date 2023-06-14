package com.test.integration.blog;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;
    private final BlogMapper blogMapper;
    private final BlogResponseDTOMapper responseDTOMapper;

    public BlogServiceImpl(BlogRepository blogRepository, BlogMapper blogMapper, BlogResponseDTOMapper responseDTOMapper) {
        this.blogRepository = blogRepository;
        this.blogMapper = blogMapper;
        this.responseDTOMapper = responseDTOMapper;
    }

    @Override
    public BlogResponseDTO createBlog(BlogRequestDTO blogRequestDTO) {
        Blog blog = blogRepository.save(blogMapper.apply(blogRequestDTO));
        return responseDTOMapper.apply(blog);
    }

    @Override
    public BlogResponseDTO getBlogById(Long id) {
        return blogRepository.findById(id).map(responseDTOMapper).orElseThrow(RuntimeException::new);
    }

    @Override
    public BlogResponseDTO updateBlog(Long id, BlogRequestDTO blogRequestDTO) {
        return null;
    }

    @Override
    public List<BlogResponseDTO> getAllBlogs() {
        return null;
    }

    @Override
    public void deleteBlog(Long id) {

    }
}
