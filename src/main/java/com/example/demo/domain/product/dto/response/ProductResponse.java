package com.example.demo.domain.product.dto.response;

import com.example.demo.domain.product.entity.Category;
import com.example.demo.domain.product.entity.IsOnSale;
import com.example.demo.domain.product.entity.Product;

import java.time.LocalDateTime;

public record ProductResponse(
        Long id,
        String name,
        Long price,
        Category category,
        IsOnSale isOnSale,
        LocalDateTime createdAt
) {
    public static ProductResponse from(Product product){
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getCategory(),
                product.getIsOnSale(),
                product.getCreatedAt()
        );
    }
}
