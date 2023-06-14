package com.test.integration.user;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserMapper implements Function<UserRequestDTO, User> {
    @Override
    public User apply(UserRequestDTO userRequestDTO) {
        return new User(
                userRequestDTO.firstName(),
                userRequestDTO.lastName(),
                userRequestDTO.mobileNumber(),
                userRequestDTO.dob()
        );
    }
}
