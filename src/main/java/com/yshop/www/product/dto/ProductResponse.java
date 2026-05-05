package com.yshop.www.product.dto;

import com.yshop.www.product.domain.ProductStatus;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record ProductResponse(UUID id,
                              String productCode,
                              String name,
                              String brand,
                              String category,
                              String description,
                              ProductStatus status,
                              Instant createdAt,
                              Instant updatedAt,
                              List<VariantResponse> variants) {
}
