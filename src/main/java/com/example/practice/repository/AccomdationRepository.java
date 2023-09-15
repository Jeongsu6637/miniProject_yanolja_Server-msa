package com.example.practice.repository;

import com.example.practice.domain.Entity.Accomdation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AccomdationRepository extends JpaRepository<Accomdation, Long> {


    @Query("select a from Accomdation a where a.accomdationId=:accomdationId")
    Optional<Accomdation> findById(Long accomdationId);
}
