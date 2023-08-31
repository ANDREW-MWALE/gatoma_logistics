package com.example.Objective1api.drivers.config;

import com.example.Objective1api.drivers.models.Driver;
import com.example.Objective1api.drivers.repository.DriverRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverConfig {
    @Bean
CommandLineRunner commandLineRunner(DriverRepository repository){
    return args -> {
        Driver Peter = new Driver(
                "Andrew",
                "Mwale",
                "mwaleandrew99@gmail.com",
                "liteta",
                "360900/17/1",
                "097000000",
                "098000000",
                "12345"
        );
        repository.save(Peter);
    };
    }
}


