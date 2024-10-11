package com.weng.dto.account.response;

import com.weng.enums.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionRes extends BaseRes {
    private FundAccountRes fundAccount;
    private TransactionType transactionType;
    private BigDecimal amount;
    private String currency;
    private LocalDateTime transactionDate;
    private String description;
}
