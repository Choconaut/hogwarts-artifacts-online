package edu.tcu.cs.hogwartsartifactsonline.hogwartsUser.dto;

import jakarta.validation.constraints.NotEmpty;

public record UserDto(
        Integer id,

        @NotEmpty(message = "username is required")
        String username,

        Boolean enabled,

        @NotEmpty(message = "roles is required")
        String roles
) {
}
