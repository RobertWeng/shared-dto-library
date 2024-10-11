package com.weng.dto.user.response;

import com.weng.enums.UserStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserRes extends BaseRes {
    private String name;
    private String email;
    private String mobileNo;
    private LocalDate dateOfBirth;
    private UserStatus status;
}
