package com.example.demo.domain.product.dto.response;

import com.example.demo.domain.product.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public record ProductPageResponse(
        List<ProductResponse> content,
        int page,
        int size,
        long totalElements,
        int totalPages
) {
    public static ProductPageResponse from(Page<Product> products){
        return new ProductPageResponse(
                products.getContent().stream().map(ProductResponse::from).toList(),
                products.getNumber(),
                products.getSize(),
                products.getTotalElements(),
                products.getTotalPages()
        );
    }
}
