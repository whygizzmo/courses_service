package com.example.courses_service.services;

import com.example.courses_service.models.requests.CalcRequest;
import com.example.courses_service.models.requests.PayRequest;
import org.springframework.http.ResponseEntity;

public interface PaymentService {
    String calculate(CalcRequest payCalcRequest);

    ResponseEntity<?> pay(PayRequest payRequest);
}
