package com.example.practice.domain.Entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity @Getter @Builder
@Table(name = "reservations")
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private Long roomId; // 예약한 방
    private UUID customerId; // 예약한 사람의 ID
    private String useName; // 이용자 이름
    private String phone; // 이용자 전화번호
    private Integer price; // 예약한 가격
    private Integer peopleNum; // 사람 수
    private Date checkIn; // 해당방의 체크인 예약날짜
    private Date checkOut; // 해당방의 체크아웃 예약날짜
    private LocalDateTime reservationTime; // 예약한 시각

    @PrePersist
    public void prePersist() {
        this.reservationTime = LocalDateTime.now();
    }


}
