package com.demotivirus.Day_245;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee implements Serializable {
    static final long serialVersionUID = 42L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long id;
    String name;
    String email;
    String jobTitle;
    String phone;
    String imageUrl;

    @Column(nullable = false, updatable = false)
    String employeeCode;
}
