package com.weng.dto.user.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRes extends UserRes {
    private String accessToken;
}
