package com.example.practice.domain.request;

import com.example.practice.domain.Entity.Reservation;
import java.util.Date;
import java.util.UUID;

public record ReservationSaveRequest(
        Long roomId,
        UUID customerId,
        String useName,
        String phone,
        Integer price,
        Integer peopleNum,
        Date checkIn,
        Date checkOut) {
    public Reservation toEntity(){
        return Reservation
                .builder()
                .roomId(roomId)
                .customerId(customerId)
                .useName(useName)
                .phone(phone)
                .price(price)
                .peopleNum(peopleNum)
                .checkIn(checkIn)
                .checkOut(checkOut)
                .build();
    }
}
