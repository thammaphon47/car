package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Drivers;
import java.time.LocalDate;
import java.time.Period;

@Service
public class DriversService {
    @Autowired
    private Drivers drivers;

    public int getAge() {
        if(drivers.getBirthday() != null){
            return Period.between(drivers.getBirthday(), LocalDate.now()).getYears();
        }else {
            return 0;
        }
}
    }