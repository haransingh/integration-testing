package com.test.integration.blog;

import com.test.integration.user.User;
import com.test.integration.user.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;
    private final BlogResponseDTOMapper responseDTOMapper;
    private final UserRepository userRepository;

    public BlogServiceImpl(BlogRepository blogRepository, BlogResponseDTOMapper responseDTOMapper, UserRepository userRepository) {
        this.blogRepository = blogRepository;
        this.responseDTOMapper = responseDTOMapper;
        this.userRepository = userRepository;
    }

    @Override
    public BlogResponseDTO createBlog(BlogRequestDTO blogRequestDTO) {
        Optional<User> user = userRepository.findById(blogRequestDTO.userId());
        if (user.isPresent()) {
            Blog blog = new Blog(
                    null,
                    blogRequestDTO.title(),
                    blogRequestDTO.des(),
                    LocalDate.now(),
                    user.get()
            );
            return responseDTOMapper.apply(blogRepository.save(blog));
        }
        return null;
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
