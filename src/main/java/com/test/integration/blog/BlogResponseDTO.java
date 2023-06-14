package com.test.integration.blog;

import java.time.LocalDateTime;

public record BlogResponseDTO(Long id, String title, String des, LocalDateTime date) {
}
