package com.example.demo.domain.users.dto.request;

import jakarta.validation.constraints.NotNull;

public record PointChargeResquest(
        @NotNull Long userId,
        @NotNull Long charging

) {
}
