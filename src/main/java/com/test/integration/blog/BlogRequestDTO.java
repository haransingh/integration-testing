package com.test.integration.blog;

import com.test.integration.user.User;

public record BlogRequestDTO(String title, String des, User user) {
}
