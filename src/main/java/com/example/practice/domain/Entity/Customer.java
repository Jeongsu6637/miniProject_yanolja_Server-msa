package com.example.practice.domain.Entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity @Getter @Builder
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customerId;
    private String email;
    private String phoneNumber;
    private Integer wallet = 200000;

}
