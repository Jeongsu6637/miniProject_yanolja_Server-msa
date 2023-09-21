package com.example.tourdestinationreservation.controller;

import com.example.tourdestinationreservation.domain.request.TourDestinationReservationRequest;
import com.example.tourdestinationreservation.repository.TourDestinationServationRepository;
import com.example.tourdestinationreservation.service.TourDestinationReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tourdestinationreservation")
@RequiredArgsConstructor
public class TourDestinationReservationController {
    private final TourDestinationReservationService tourDestinationReservationService;
    public void save(@RequestBody TourDestinationReservationRequest tourDestinationReservationRequest)
    {
        tourDestinationReservationService.save(tourDestinationReservationRequest);
    }
}
