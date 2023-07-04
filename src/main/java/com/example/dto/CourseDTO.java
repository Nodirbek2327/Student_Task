package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class CourseDTO {
    private Integer id;
    private String name;
    private String price;
    private String duration;
    private LocalDate createdDate;
}
