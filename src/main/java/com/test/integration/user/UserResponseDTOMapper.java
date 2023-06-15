package com.test.integration.user;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserResponseDTOMapper implements Function<User, UserResponseDTO> {
    @Override
    public UserResponseDTO apply(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getMobileNumber(),
                user.getDob()
        );
    }
}
