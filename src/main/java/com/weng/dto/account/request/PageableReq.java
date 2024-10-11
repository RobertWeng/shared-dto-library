package com.weng.dto.account.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Data
@NoArgsConstructor
public class PageableReq {
    @Min(1)
    private int page = 1;

    @Min(1)
    @Schema(example = "10")
    private int size = 10;

    public Pageable pageable() {
        return PageRequest.of(page - 1, size);
    }
}
