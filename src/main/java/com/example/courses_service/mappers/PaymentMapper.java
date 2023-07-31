package com.example.courses_service.mappers;

import com.example.courses_service.models.dtos.PaymentDto;
import com.example.courses_service.models.entities.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentMapper {
    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    Payment toPayment(PaymentDto paymentDto);
    PaymentDto toPaymentDto(Payment payment);
}
