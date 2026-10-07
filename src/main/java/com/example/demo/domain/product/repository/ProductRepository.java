package com.example.demo.domain.product.repository;

import com.example.demo.domain.product.entity.Category;
import com.example.demo.domain.product.entity.IsOnSale;
import com.example.demo.domain.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Page<Product> findByIsOnSaleNot(IsOnSale isOnSale, Pageable pageable);
    Page<Product> findByCategoryAndIsOnSaleNot(Category category, IsOnSale isOnSale,Pageable pageable);
}
