package com.example.demo.domain.product.entity;

import com.example.demo.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "products")
@Getter
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20)
    private String name;
    @Column(nullable = false)
    private Long price;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IsOnSale isOnSale;


}
