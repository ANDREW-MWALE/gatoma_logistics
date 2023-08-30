package com.example.Objective1api.drivers.controller;


import com.example.Objective1api.drivers.models.Driver;
import com.example.Objective1api.drivers.pojo.ResponsePojo;
import com.example.Objective1api.drivers.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping
   // @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createNewDriver_whenPostDriver(@RequestBody Driver driver){
        Driver createdDriver = driverService.createNewDriver(driver);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdDriver.getId()).toUri();
        return ResponseEntity.created(uri).body(createdDriver);
    }

    @GetMapping
public ResponseEntity<?> getDrivers(){
        return ResponseEntity.ok(new ResponsePojo(HttpStatus.OK.value(), driverService.getDrivers()));
        }
        @PutMapping
        public ResponseEntity<?> updateDrivers(@PathVariable Long driverId, Driver driver){
        return ResponseEntity.ok().body(driverService.updateDriver(driverId, driver));
    }
    @DeleteMapping
    public void deleteDrivers(@PathVariable Long driverId){
        driverService.deleteDriver(driverId);

    }

    }

