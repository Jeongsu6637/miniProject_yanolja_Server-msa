package com.example.practice.repository;

import com.example.practice.domain.Entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("select c from Customer c where c.customerId=:customerId")
    Optional<Customer> findById(UUID customerId);

    @Transactional
    @Modifying
    @Query("update Customer c set c.wallet =:wallet where c.customerId=:customerId")
    void updateWallet(UUID customerId, Integer wallet);
}
