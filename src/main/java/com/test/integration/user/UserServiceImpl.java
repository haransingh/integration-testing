package com.test.integration.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ObjectMapper mapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, ObjectMapper mapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.mapper = mapper;
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user = userRepository.save(userMapper.apply(userRequestDTO));
        return null;
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        return null;
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
