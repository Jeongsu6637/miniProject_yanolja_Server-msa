package com.example.practice.domain.request;

import com.example.practice.domain.Entity.Room;

public record RoomSaveRequest(
        String roomNumber,
        String roomName,
        Integer roomPrice,
        Integer roomMaxPerson,
        String roomImage,
        String checkIn,
        String checkOut

) {
    public Room toEntity(){
        return Room
                .builder()
                .roomNumber(roomNumber)
                .roomName(roomName)
                .roomPrice(roomPrice)
                .roomMaxPerson(roomMaxPerson)
                .roomImage(roomImage)
                .checkIn(checkIn)
                .checkOut(checkOut)
                .build();
    }
}
