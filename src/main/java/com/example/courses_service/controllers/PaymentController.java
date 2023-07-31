package com.example.courses_service.controllers;

import com.example.courses_service.models.dtos.PaymentDto;
import com.example.courses_service.models.entities.Payment;
import com.example.courses_service.models.requests.CalcRequest;
import com.example.courses_service.models.requests.PayRequest;
import com.example.courses_service.services.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

   private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    Payment save(PaymentDto paymentDto){
        return null;
    }

    @PostMapping("/calc")
    String calculate(@RequestBody CalcRequest calcRequest){
         return paymentService.calculate(calcRequest);
    }

    @PutMapping("/pay")
    ResponseEntity<?> pay (@RequestBody PayRequest payRequest){
    return paymentService.pay(payRequest);
    }

}
