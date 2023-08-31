package com.example.Objective1api.drivers.controller;

import com.example.Objective1api.drivers.models.Driver;
import com.example.Objective1api.drivers.service.DriverService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DriverControllerTest {
 private DriverService driverService;
    @Test
    void createNewDriver() {

    }

    @Test
    void getDrivers() {
       List<Driver> driverList = driverService.getDrivers();
       assertEquals(5, driverList.size());
//        List<Driver> driverList = driverService.getDrivers();
//        assertEquals(5, driverList.size());
    }

    @Test
    void updateDrivers() {
    }

    @Test
    void deleteDrivers() {
    }
}