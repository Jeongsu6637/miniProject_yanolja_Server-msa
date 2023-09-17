package com.example.practice.domain.Entity.response;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public record ReservationResponse(
        Long roomId,
        UUID customerId,
        String useName,
        String phone,
        Integer price,
        Integer peopelNum,
        Date checkIn,
        Date checkOut,
        LocalDateTime reservationTime
) {
}
