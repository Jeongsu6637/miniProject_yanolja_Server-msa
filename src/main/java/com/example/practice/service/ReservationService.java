package com.example.practice.service;

import com.example.practice.domain.Entity.Reservation;
import com.example.practice.domain.Entity.response.ReservationResponse;
import com.example.practice.domain.request.ReservationCheckRequest;
import com.example.practice.domain.request.ReservationSaveRequest;
import com.example.practice.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
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
                e.getUseName(),
                e.getPhone(),
                e.getPrice(),
                e.getPeopleNum(),
                e.getCheckIn(),
                e.getCheckOut(),
                e.getReservationTime()
        )).toList();
    }

    public Optional<Boolean> check(ReservationCheckRequest request) {
        // 예약할 방(Room)에 대한 모든 예약을 가져옵니다.
        List<Reservation> reservationsForRoom = reservationRepository.findByRoomId(request.roomId());

        // 새로 예약하려는 날짜 범위를 만듭니다.
        Date newCheckIn = request.checkIn();
        Date newCheckOut = request.checkOut();

        // 기존 예약된 날짜와 중첩 여부를 검사합니다.
        boolean isOverlap = reservationsForRoom.stream()
                .anyMatch(reservation -> {
                    Date existingCheckIn = reservation.getCheckIn();
                    Date existingCheckOut = reservation.getCheckOut();

                    // 예약한 날짜 범위가 기존 예약과 중첩되면 true를 반환합니다.
                    return newCheckIn.before(existingCheckOut) && existingCheckIn.before(newCheckOut);
                });

        return Optional.of(isOverlap); // 중첩이 있을 경우 false 반환
    }
    public void save(ReservationSaveRequest request){
        reservationRepository.save(request.toEntity());
    }

}
