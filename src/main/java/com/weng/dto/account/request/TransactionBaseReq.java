package com.weng.dto.account.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class TransactionBaseReq {

    @DecimalMin(value = "0.0", inclusive = false) // Decimal must higher than 0.0
    @Digits(integer = 10, fraction = 2)
    private BigDecimal amount;

    @NotBlank
    @Schema(example = "MYR")
    private String currency;
}
