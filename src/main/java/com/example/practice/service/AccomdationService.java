package com.example.practice.service;

import com.example.practice.domain.Entity.Accomdation;
import com.example.practice.domain.Entity.response.AccomdationResponse;
import com.example.practice.domain.request.AccomdationSaveRequest;
import com.example.practice.repository.AccomdationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccomdationService {
    private final AccomdationRepository accomdationRepository;

    public void save(AccomdationSaveRequest request){
        accomdationRepository.save(request.toEntity());
    }

    public AccomdationResponse getById(Long accomdationId){
        Optional<Accomdation> byId = accomdationRepository.findById(accomdationId);
        if (byId.isPresent()) {
            Accomdation accomdation = byId.get();
            return new AccomdationResponse(
                    accomdation.getAccomdationName(),
                    accomdation.getAccomdationType(),
                    accomdation.getAccomdationLocation(),
                    accomdation.getAccomdationGrade(),
                    accomdation.getAccomdationContent(),
                    accomdation.getAccomdationCount()
            );
        } else {
            // 예외 처리: 주어진 ID에 해당하는 Accomdation이 없을 경우
            throw new RuntimeException("not found for ID: " + accomdationId);
        }
    }

}
