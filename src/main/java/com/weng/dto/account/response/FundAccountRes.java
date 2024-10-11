package com.weng.dto.account.response;

import com.weng.enums.FundAccountStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FundAccountRes extends BaseRes {

    private String accountNumber;
    private Long userId;
    private BigDecimal balance;
    private String currency;
    private FundAccountStatus status;
    
}
