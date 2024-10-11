package com.weng.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginReq {
    @NotBlank
    private String mobileNo;

    @NotBlank
    private String password;
}
