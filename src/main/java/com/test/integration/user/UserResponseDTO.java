package com.test.integration.user;

import java.sql.Date;

public record UserResponseDTO(Long id, String firstName, String lastName, String mobileNumber, Date dob) {
}
