package com.example.courses_service.controllers;

import com.example.courses_service.models.dtos.PaymentDto;
import com.example.courses_service.models.entities.Payment;
import com.example.courses_service.models.requests.PayCalcRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    Payment save(PaymentDto paymentDto){
        return null;
    }


    String calculate(@RequestBody PayCalcRequest payCalcRequest){

        return null;
        // return paymentService.calculate(payCalcRequest);
    }

}
