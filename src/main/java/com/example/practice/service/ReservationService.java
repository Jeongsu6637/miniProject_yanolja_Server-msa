package com.example.practice.service;

import com.example.practice.domain.Entity.Reservation;
import com.example.practice.domain.Entity.response.ReservationResponse;
import com.example.practice.domain.request.ReservationCheckRequest;
import com.example.practice.domain.request.ReservationSaveRequest;
import com.example.practice.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public List<ReservationResponse> getById(Long customerId){
        List<Reservation> byCustomerId = reservationRepository.getByCustomerId(customerId);

        return byCustomerId.stream().map((e)-> new ReservationResponse(
                e.getRoomId(),
                e.getCustomerId(),
                e.getPrice(),
                e.getPeopleNum(),
                e.getCheckIn(),
                e.getCheckOut(),
                e.getReservationTime()
        )).toList();
    }

    public Optional<Boolean> check(ReservationCheckRequest request){
        Optional<Boolean> byRoomId = reservationRepository.findByRoomIdAndCheckInAndCheckOut(request.roomId(), request.checkIn(), request.checkOut());
        try {
            if (byRoomId.isEmpty()){
                System.out.println("가능");
            }else {
                System.out.println("불가능");
            }
        }catch (Exception e){
            e.getMessage();
        }
        return byRoomId;
    }
    public void save(ReservationSaveRequest request){
        reservationRepository.save(request.toEntity());
    }

}
