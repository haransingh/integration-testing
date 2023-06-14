package com.test.integration.user;

import java.sql.Date;

public record UserRequestDTO(String firstName, String lastName, String mobileNumber, Date dob) {
}
