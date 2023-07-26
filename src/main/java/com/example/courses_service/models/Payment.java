package com.example.courses_service.models;

import com.example.courses_service.models.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne
    Student student;
    @ManyToOne
    Course course;
    double paid;
    double price;
    double debt;
    Date date;
    @Enumerated(value = EnumType.STRING)
    PaymentStatus paymentStatus;

}
