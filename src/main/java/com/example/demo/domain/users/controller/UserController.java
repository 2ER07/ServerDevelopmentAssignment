package com.example.demo.domain.users.controller;

import com.example.demo.domain.users.dto.request.PointChargeResquest;
import com.example.demo.domain.users.dto.response.PointChargeResponse;
import com.example.demo.domain.users.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/point/charging")
    public ResponseEntity<PointChargeResponse> chargePoint(@Valid @RequestBody PointChargeResquest resquest){
        return ResponseEntity.ok(userService.chargePoint(resquest));
    }

}
