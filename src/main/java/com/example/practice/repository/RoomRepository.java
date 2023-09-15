package com.example.practice.repository;

import com.example.practice.domain.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("select r from Room r where r.roomId=:roomId")
    Optional<Room> findById(Long roomId);
}
