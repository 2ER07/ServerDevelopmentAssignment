package com.example.demo.domain.product.controller;

import com.example.demo.domain.product.dto.response.ProductPageResponse;
import com.example.demo.domain.product.entity.Category;
import com.example.demo.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class productController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<ProductPageResponse> findAdd(@RequestParam(defaultValue = "0")int page,
                                                       @RequestParam(defaultValue = "30") int size,
                                                       @RequestParam(required = false)Category category) {
        return ResponseEntity.ok(productService.findAdd(page,size,category));
    }
}
