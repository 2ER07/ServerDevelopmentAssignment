package com.example.demo.domain.product.service;

import com.example.demo.common.exception.CustomException;
import com.example.demo.common.exception.ErrorCode;
import com.example.demo.domain.product.dto.response.ProductPageResponse;
import com.example.demo.domain.product.entity.Category;
import com.example.demo.domain.product.entity.IsOnSale;
import com.example.demo.domain.product.entity.Product;
import com.example.demo.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class ProductService {
    private final ProductRepository productRepository;

    public ProductPageResponse findAdd(int page, int size, Category category) {
        if (page < 0 || size <=0){
            throw new CustomException(ErrorCode.INVALID_PARAMETER);
        }
        PageRequest createdAt = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "createdAt"));
        Page<Product> products = (category==null)
                ? productRepository.findByIsOnSaleNot(IsOnSale.DISCONTINUED, createdAt)
                : productRepository.findByCategoryAndIsOnSaleNot(category, IsOnSale.DISCONTINUED, createdAt);
        return ProductPageResponse.from(products);

    }
}
