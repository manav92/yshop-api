package com.yshop.www.product.api;

import com.yshop.www.product.dto.CreateProductRequest;
import com.yshop.www.product.dto.ProductResponse;
import com.yshop.www.product.dto.VariantResponse;
import com.yshop.www.product.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse create(@Valid @RequestBody CreateProductRequest request) {
        return productService.create(request);
    }

    @GetMapping
    public List<ProductResponse> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{productCode}")
    public ProductResponse getByProductCode(@PathVariable String productCode) {
        return productService.getByProductCode(productCode);
    }

    @GetMapping("/sku/{sku}")
    public VariantResponse getBySku(@PathVariable String sku) {
        return productService.getBySku(sku);
    }
}
