package com.example.demo.domain.users.dto.response;

import com.example.demo.domain.users.entity.User;

public record PointChargeResponse(
        Long userId,
        Long charging,
        Long point
) {
    public static PointChargeResponse of(User user,Long charging){
        return new PointChargeResponse(user.getId(),charging, user.getPoint());
    }
}
