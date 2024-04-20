package com.student.entity;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private School school;
}
