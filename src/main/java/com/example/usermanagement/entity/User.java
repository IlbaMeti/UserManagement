package com.example.usermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDateTime dateOfBirth;
    private LocalDateTime registrationDate;
    private boolean isActive;

    public User(String firstName, String lastName, String email, String phoneNumber, LocalDateTime dateOfBirth, LocalDateTime registrationDate, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.isActive = isActive;
    }
}
