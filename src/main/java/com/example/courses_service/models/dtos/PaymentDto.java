package com.example.courses_service.models.dtos;

import com.example.courses_service.models.entities.Course;
import com.example.courses_service.models.entities.Student;
import com.example.courses_service.models.enums.PaymentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentDto {
    Long id;
    Student student;
    Course course;
    double paid;
    double price;
    double debt;
    Date date;
    @Enumerated(value = EnumType.STRING)
    PaymentStatus paymentStatus;
}
