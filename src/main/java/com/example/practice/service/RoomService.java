package com.example.practice.service;

import com.example.practice.domain.Entity.Accomdation;
import com.example.practice.domain.Entity.Room;
import com.example.practice.domain.Entity.response.AccomdationResponse;
import com.example.practice.domain.Entity.response.RoomInfoResponse;
import com.example.practice.domain.request.AccomdationSaveRequest;
import com.example.practice.domain.request.RoomSaveRequest;
import com.example.practice.repository.AccomdationRepository;
import com.example.practice.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public void save(RoomSaveRequest request){
        roomRepository.save(request.toEntity());
    }

    public RoomInfoResponse getById(Long roomId){
        Optional<Room> byId = roomRepository.findById(roomId);
        if (byId.isPresent()) {
            Room room = byId.get();
            return new RoomInfoResponse(
                    room.getRoomNumber(),
                    room.getRoomName(),
                    room.getRoomPrice(),
                    room.getRoomMaxPerson(),
                    room.getRoomImage1(),
                    room.getRoomImage2(),
                    room.getRoomImage3(),
                    room.getRoomImage4(),
                    room.getCheckIn(),
                    room.getCheckOut()
            );
        } else {
            // 예외 처리: 주어진 ID에 해당하는 room 없을 경우
            throw new RuntimeException("not found for ID: " + roomId);
        }
    }

}
