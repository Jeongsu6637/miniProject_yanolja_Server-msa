package com.example.tourdestinationreservation.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tourdestinationreservations")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TourDestinationReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tourDestinationId;
    private String userId;
    private String userName;
    private String userPhoneNumber;
    private Integer payment;
    private String reservationTime;
    private Integer reservationNumberOfPeople;
}
