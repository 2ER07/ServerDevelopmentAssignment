package com.example.demo.domain.users.service;

import com.example.demo.common.exception.CustomException;
import com.example.demo.common.exception.ErrorCode;
import com.example.demo.domain.users.dto.request.PointChargeResquest;
import com.example.demo.domain.users.dto.response.PointChargeResponse;
import com.example.demo.domain.users.entity.User;
import com.example.demo.domain.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public PointChargeResponse chargePoint(PointChargeResquest resquest) {
        User user = userRepository.findById(resquest.userId())
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));

        user.chargePoint(resquest.charging());
        return PointChargeResponse.of(user,resquest.charging());
    }
}
