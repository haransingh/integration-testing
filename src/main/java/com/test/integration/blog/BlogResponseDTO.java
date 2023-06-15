package com.test.integration.blog;

import java.time.LocalDate;
public record BlogResponseDTO(Long id, String title, String des, LocalDate date) {
}
