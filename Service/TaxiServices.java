package com.example.demo.Service;

import com.example.demo.Entity.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiServices {
    @Autowired
    private CarService carService;
    @Autowired
    private Taxi taxi;


    public double calPrice(double kilo){
        return taxi.getFare() * kilo;
    }
    @Override
    public void drive(double kilo) throws Exception {
        if(taxi.getPassenger() < 1){
            throw new Exception("Please receive passenger.");
        }
        super.drive(kilo);
        taxi.getPassenger() = 0;
        System.out.println("จำนวนผู้โดยสาร: "+taxi.getPassenger());
        System.out.println("ราคาค่าบริการ: "+calPrice(kilo));
    }

}
