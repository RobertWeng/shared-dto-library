package com.weng.dto.account.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferRes {
    private TransactionRes fromTransaction;
    private TransactionRes toTransaction;
}
