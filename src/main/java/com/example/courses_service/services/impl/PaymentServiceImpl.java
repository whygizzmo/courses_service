package com.example.courses_service.services.impl;

import com.example.courses_service.mappers.PaymentMapper;
import com.example.courses_service.models.dtos.PaymentDto;
import com.example.courses_service.models.entities.Payment;
import com.example.courses_service.models.enums.PaymentStatus;
import com.example.courses_service.models.requests.CalcRequest;
import com.example.courses_service.models.requests.PayRequest;
import com.example.courses_service.repos.CourseRepository;
import com.example.courses_service.repos.PaymentRepository;
import com.example.courses_service.repos.StudentRepository;
import com.example.courses_service.services.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final CourseRepository courseRepository;
    private final PaymentRepository paymentRepository;
    private final StudentRepository studentRepository;

    public PaymentServiceImpl(CourseRepository courseRepository, PaymentRepository paymentRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.paymentRepository = paymentRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public String calculate(CalcRequest payCalcRequest) {
        Payment payment = new Payment();
        payment.setCourse(courseRepository.findById(payCalcRequest.getCourseId()).get());
        payment.setStudent(studentRepository.findById(payCalcRequest.getStudentId()).get());
        payment.setPrice(payment.getCourse().getTotalPrice());
        payment.setPaymentStatus(PaymentStatus.NOT_PAID);
        payment = paymentRepository.save(payment);

        return "Price = " + payment.getPrice() + ", IdPayment = " + payment.getId();
        //// метод calculate принимает айди курса и айди студента
        // создать объект пеймонт добавить туда студена и курс найденных по айди
        // дать значение полю прайс от поля тотал прайс у курса и сохранить пеймонт с этими 3 полями
        //вернуть айди платежа и сумму
    }

    @Override
    public ResponseEntity<?> pay(PayRequest payRequest) {
        Payment payment = paymentRepository.findById(payRequest.getPaymentId()).get();
        PaymentDto paymentDto = PaymentMapper.INSTANCE.toPaymentDto(payment);
        if (payRequest.getPaid() >= payment.getPrice() - payment.getPaid()) {
            payment.setPaymentStatus(PaymentStatus.PAID);
            payment.setPaid(payment.getPaid() + payRequest.getPaid());
            payment.setDebt(0);
            payment.setDate(new Date());
            paymentRepository.save(payment);
            return ResponseEntity.ok("Course completed successfully");
        } else {
            payment.setPaid(payment.getPaid() + payRequest.getPaid());
            payment.setDebt(payment.getPrice() - payment.getPaid());
            payment.setDate(new Date());
            paymentRepository.save(payment);

            return ResponseEntity.ok("you need to pay extra : " + payment.getDebt());
        }

    }

}
