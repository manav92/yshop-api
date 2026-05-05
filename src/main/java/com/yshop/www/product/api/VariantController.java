package com.yshop.www.product.api;

import com.yshop.www.product.dto.CreateVariantRequest;
import com.yshop.www.product.dto.VariantResponse;
import com.yshop.www.product.service.ProductVariantService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/products/{productId}/variants")
public class VariantController {
    private final ProductVariantService variantService;

    public VariantController(ProductVariantService variantService) {
        this.variantService = variantService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VariantResponse create(@PathVariable UUID productId,
                                  @Valid @RequestBody CreateVariantRequest request) {
        return variantService.create(productId, request);
    }
}
