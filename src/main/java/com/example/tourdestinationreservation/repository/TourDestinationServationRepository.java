package com.example.tourdestinationreservation.repository;

import com.example.tourdestinationreservation.domain.entity.TourDestinationReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourDestinationServationRepository extends JpaRepository<TourDestinationReservation, Long> {
}
