package com.example.practice.controller;

import com.example.practice.domain.Entity.response.AccomdationResponse;
import com.example.practice.domain.request.AccomdationSaveRequest;
import com.example.practice.service.AccomdationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/accomdation")
@CrossOrigin(methods = {RequestMethod.POST}, allowCredentials = "true", originPatterns = "*")
public class AccomdationController {
    private final AccomdationService accomdationService;
    @PostMapping("/save") // 숙소 등록
    void save(@RequestBody AccomdationSaveRequest request){
        accomdationService.save(request);
    }

    @PostMapping("/info/{accomdationId}") // 해당 숙소에 대한 정보를 가져옴
    AccomdationResponse getInfo(@PathVariable("accomdationId") Long accomdationId){
        return accomdationService.getById(accomdationId);
    }


}
