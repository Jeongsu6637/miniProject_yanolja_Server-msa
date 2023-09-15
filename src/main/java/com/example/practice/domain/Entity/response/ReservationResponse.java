package com.example.practice.domain.Entity.response;

import java.time.LocalDateTime;
import java.util.Date;

public record ReservationResponse(
        Long roomId,
        Long customerId,
        Integer price,
        Integer peopelNum,
        Date checkIn,
        Date checkOut,
        LocalDateTime reservationTime
) {
}
