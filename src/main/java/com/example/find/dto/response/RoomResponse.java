package com.example.find.dto.response;

import com.example.find.Entity.Room;


public record RoomResponse(

        Long id,
        String roomNumber, //방번호
        String roomName, //방이름
        Integer roomPrice,
        Integer roomMaxPerson, //방인원
        String roomImage1,
        String roomImage2,
        String roomImage3,
        String roomImage4,
        String checkIn,
        String checkOut

//        AccomResponse accomdationResponse //숙박시설


//        @OneToMany(mappedBy = "room")
//        private List<ReservationDate> reservationDateList;
//        @ManyToOne
//        private Accomdation accomdation;

) {

    public static RoomResponse of(Room room){
        return new RoomResponse(
                room.getId(),
                room.getRoomNumber(),
                room.getRoomName(),
                room.getRoomPrice(),
                room.getRoomMaxPerson(),
                room.getRoomImage1(),
                room.getRoomImage2(),
                room.getRoomImage3(),
                room.getRoomImage4(),
                room.getCheckIn(),
                room.getCheckOut()
        );
    }
}
