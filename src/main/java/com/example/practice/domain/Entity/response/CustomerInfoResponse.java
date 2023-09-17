package com.example.practice.domain.Entity.response;

import java.util.UUID;

public record CustomerInfoResponse(UUID customerId,
                                   String email,
                                   String phoneNumber,
                                   Integer wallet) {
}
