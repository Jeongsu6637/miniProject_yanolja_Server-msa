package com.example.tourdestinationreservation.service;

import com.example.tourdestinationreservation.domain.request.TourDestinationReservationRequest;
import com.example.tourdestinationreservation.repository.TourDestinationServationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TourDestinationReservationService {
    private final TourDestinationServationRepository tourDestinationServationRepository;
    public void save(TourDestinationReservationRequest tourDestinationReservationRequest)
    {
        tourDestinationServationRepository.save(tourDestinationReservationRequest.toEntity());
    }

}
