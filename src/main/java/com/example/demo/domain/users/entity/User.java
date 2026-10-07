package com.example.demo.domain.users.entity;

import com.example.demo.common.entity.BaseEntity;
import com.example.demo.common.exception.CustomException;
import com.example.demo.common.exception.ErrorCode;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.example.demo.common.exception.ErrorCode.INVALID_AMOUNT;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 50)
    private String name;
    @Column(nullable = false)
    private Long point;

    public User(String name) {
        this.name = name;
        this.point= 0L;
    }

    public void chargePoint (Long amount) {
        if(amount ==null ||amount<=0){
            throw new CustomException(INVALID_AMOUNT);
        }
        this.point += amount;
    }
}
