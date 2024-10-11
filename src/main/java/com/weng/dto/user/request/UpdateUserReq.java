package com.weng.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UpdateUserReq {
    @NotBlank
    private String name;

    @NotNull
    private LocalDate dateOfBirth;
}
