package com.example.practice.domain.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity @Getter @Builder
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private UUID customerId;
    private String email;
    private String phoneNumber;
    private Integer wallet;

    @PrePersist
    public void prePersist() {
        this.wallet = 100000;
    }

}
