package com.example.courses_service.models.dtos;

import com.example.courses_service.models.entities.Language;
import com.example.courses_service.models.entities.Student;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    Long id;
    Language language;
    boolean isBootcamp;
    double totalPrice;
    List<Student> students;
    @CreationTimestamp
    Date startDate;
    Date endDate;
}
