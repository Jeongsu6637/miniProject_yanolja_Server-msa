package com.example.practice.domain.request;

import com.example.practice.domain.Entity.Customer;

import java.util.UUID;

public record CustomerSaveRequest(
        UUID customerId,
        String email,
        String name,
        String phoneNumber,
        Integer wallet

) {
    public Customer toEntity(){
        return Customer
                .builder()
                .customerId(customerId)
                .email(email)
                .name(name)
                .phoneNumber(phoneNumber)
                .wallet(wallet)
                .build();
    }
}
