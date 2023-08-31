package com.example.Objective1api.drivers.repository;

import com.example.Objective1api.drivers.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByEmail(String email);
    Optional<Driver> findById(Long aLong);
}
