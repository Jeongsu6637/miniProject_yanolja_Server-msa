package com.example.find.Entity;


import com.example.find.dto.request.RoomRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rooms")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNumber; //방번호
    private String roomName; //방이름
    private Integer roomPrice; // 방 가격
    private Integer roomMaxPerson; //방인원
    private String roomImage1; // 방 사진1
    private String roomImage2; // 방 사진2
    private String roomImage3; // 방 사진3
    private String roomImage4; // 방 사진4
    private String checkIn; //체크 인 시간
    private String checkOut; //체크 아웃 시간
    @ManyToOne
    private Accomdation accomdation;
    public void updateRoom (RoomRequest roomRequest){
        roomNumber=roomRequest.roomNumber();
       roomName=roomRequest.roomName();
       roomMaxPerson=roomRequest.roomMaxPerson();
    }

}
