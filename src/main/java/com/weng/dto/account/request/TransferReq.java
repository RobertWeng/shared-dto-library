package com.weng.dto.account.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TransferReq extends TransactionBaseReq {
    @NotNull
    private Long toUserId;
}
