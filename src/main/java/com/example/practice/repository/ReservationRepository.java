package com.example.practice.repository;

import com.example.practice.domain.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("select r from Reservation r where r.roomId =:roomId")
    Optional<Boolean> findByRoomId(Long roomId);

}
