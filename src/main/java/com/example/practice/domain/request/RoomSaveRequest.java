//package com.example.practice.domain.request;
//
//import com.example.practice.domain.Entity.Room;
//
//public record RoomSaveRequest(
//        String roomNumber,
//        String roomName,
//        Integer roomPrice,
//        Integer roomMaxPerson,
//        String roomImage1,
//        String roomImage2,
//        String roomImage3,
//        String roomImage4,
//        String checkIn,
//        String checkOut
//
//) {
//    public Room toEntity(){
//        return Room
//                .builder()
//                .roomNumber(roomNumber)
//                .roomName(roomName)
//                .roomPrice(roomPrice)
//                .roomMaxPerson(roomMaxPerson)
//                .roomImage1(roomImage1)
//                .roomImage2(roomImage2)
//                .roomImage3(roomImage3)
//                .roomImage4(roomImage4)
//                .checkIn(checkIn)
//                .checkOut(checkOut)
//                .build();
//    }
//}
