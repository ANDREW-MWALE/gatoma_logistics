package com.example.Objective1api.drivers.service;

import com.example.Objective1api.drivers.models.Driver;
import com.example.Objective1api.drivers.pojo.DriverPojo;
import com.example.Objective1api.drivers.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
    //posting new user
    @Autowired
    private DriverRepository driverRepository;

    public Driver createNewDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @GetMapping
    public List<Driver> getDrivers() {
        return driverRepository.findAll();
    }


    public Driver listDriver(DriverPojo driverPojo) {
        Optional<Driver> driverOptional = driverRepository.findByEmail(driverPojo.getEmail());
        if (!driverOptional.isPresent()) {
            throw new IllegalStateException("user is not present");
        } else {
            Driver driver = new Driver();
            driver.setFname(driver.getFname());
            driver.setLname(driverPojo.getLname());
            driver.setEmail(driverPojo.getEmail());
            driver.setNrc(driverPojo.getNrc());
            driver.setAddress(driverPojo.getAddress());
            //driver.setPhoneNumber(driverPojo.getPhoneNumber());
            driver.setLicense(driverPojo.getLicense());
            return driverRepository.save(driver);
        }
    }

    public Driver updateDriver(Long driverId, Driver driver) {
        Optional<Driver> driverOptional = driverRepository.findById(driverId);
        if (!driverOptional.isPresent()) {
            throw new IllegalStateException("user is present");
        } else {
            driverRepository.findById(driverId);
            return driverRepository.save(driver);
        }
    }

    public void deleteDriver(Long driverId) {
        Optional<Driver> driverOptional = driverRepository.findById(driverId);
        if (!driverOptional.isEmpty()) {
            throw new IllegalStateException("user is not present");
        } else {
            driverRepository.deleteById(driverId);
        }
    }
}


