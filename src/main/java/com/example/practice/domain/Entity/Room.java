package com.example.practice.domain.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Builder
@Table(name = "rooms")
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId; // 방 고유번호
    private String roomNumber; // 방호수번호 (201, 203)
    private String roomName; // 방이름 (스위트, 골드 디럭스)
    private Integer roomPrice; // 방 가격
    private Integer roomMaxPerson; // 방최대인원
    @Column(length = 10000)
    private String roomImage1; // 방 사진1
    private String roomImage2; // 방 사진2
    private String roomImage3; // 방 사진3
    private String roomImage4; // 방 사진4
    private String checkIn; //체크 인 시간
    private String checkOut; //체크 아웃 시간
    @ManyToOne
    private Accomdation accomdation;
}
