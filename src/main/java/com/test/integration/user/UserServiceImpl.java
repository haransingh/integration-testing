package com.test.integration.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserResponseDTOMapper responseDTOMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, UserResponseDTOMapper responseDTOMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.responseDTOMapper = responseDTOMapper;
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        return responseDTOMapper.apply(userRepository.save(userMapper.apply(userRequestDTO)));
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
