package com.example.practice.controller;

import com.example.practice.domain.Entity.response.CustomerInfoResponse;
import com.example.practice.domain.request.CustomerSaveRequest;
import com.example.practice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(methods = {RequestMethod.POST, RequestMethod.PUT}, allowCredentials = "true", originPatterns = "*")

public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/save") // 회원가입
    void save(@RequestBody CustomerSaveRequest request){
        customerService.save(request);
    }

    @PostMapping("/info/{customerId}") // 결제 할때 id를 통해 사용자의 정보를 가져온다
    CustomerInfoResponse getById(@PathVariable("customerId") UUID customerId){
        return customerService.getById(customerId);
    }

    @PutMapping("/update/{customerId}")
    void delete(@PathVariable("customerId") UUID customerId,
                @RequestParam("result") Integer wallet){
        customerService.update(customerId, wallet);
    }

}
