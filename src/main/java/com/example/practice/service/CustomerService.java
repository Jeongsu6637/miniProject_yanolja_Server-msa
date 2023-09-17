package com.example.practice.service;

import com.example.practice.domain.Entity.Customer;
import com.example.practice.domain.Entity.response.CustomerInfoResponse;
import com.example.practice.domain.request.CustomerSaveRequest;
import com.example.practice.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public void save(CustomerSaveRequest request){
        customerRepository.save(request.toEntity());
    }

    public CustomerInfoResponse getById(UUID customerId){
        Optional<Customer> byId = customerRepository.findById(customerId);
        if (byId.isPresent()) {
            Customer customer = byId.get();
            return new CustomerInfoResponse(
                    customer.getCustomerId(),
                    customer.getEmail(),
                    customer.getPhoneNumber(),
                    customer.getWallet()
            );
        } else {
            // 예외 처리: 주어진 ID에 해당하는 room 없을 경우
            throw new RuntimeException("not found for ID: " + customerId);
        }
    }

    @Transactional
    public void update(UUID customerId, Integer wallet){
        customerRepository.updateWallet(customerId, wallet);
    }

}
