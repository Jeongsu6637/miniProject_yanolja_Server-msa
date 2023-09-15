package com.example.practice.domain.Entity.response;

public record  RoomInfoResponse(String roomNumber,
                               String roomName,
                               Integer roomPrice,
                               Integer roomMaxPerson,
                               String roomImage,
                               String checkIn,
                               String checkOut) {
}
