package com.example.practice.domain.Entity.response;

import java.util.UUID;

public record CustomerInfoResponse(UUID customerId,
                                   String email,
                                   String name,
                                   String phoneNumber,
                                   Integer wallet) {
}
