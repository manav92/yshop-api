package com.yshop.www.product.dto;

import com.yshop.www.product.domain.VariantStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record VariantResponse(UUID id,
                              UUID productId,
                              String sku,
                              String size,
                              String design,
                              BigDecimal priceAmount,
                              String currency,
                              VariantStatus status,
                              Instant createdAt,
                              Instant updatedAt) {
}
