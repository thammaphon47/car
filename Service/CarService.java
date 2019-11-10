package com.example.demo.Service;

import com.example.demo.Entity.Car;
import com.example.demo.Entity.Gen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Drivers;

@Service
public class CarService {
    @Autowired
    private Car car;
    @Autowired
    private Drivers drivers;
    @Autowired
    private Gen gen;
    @Autowired
    private DriversService driversService;

    public void drive(double kilo) throws Exception {
        if (car.getDriver() != null && driversService.getAge() < 18) {
            throw new Exception("Invalid driver.");
        }

        double totalFuelUse = car.getFuelUsage() * kilo;
        if ((car.getCapacityFuel() - totalFuelUse)  < 0) {
            throw new Exception("Please fill fuel.");
        }
        car.getCapacityFuel() = car.getCapacityFuel() - totalFuelUse;
        System.out.println("ระยะทางที่ขับ : " + kilo);
        System.out.println("น้ำมันที่ใช้ไป : " + totalFuelUse);
        System.out.println("น้ำมันคงเหลือ : " + car.getCapacityFuel());
    }
    public void fillFuel(double liter) throws Exception {
        double remain = car.getCapacityCar() - car.getCapacityFuel();
        double actualLiterTemp = 0;
        if(remain>=liter){
            actualLiterTemp = liter;
        }
        else {
            actualLiterTemp = remain;
        }
        car.getCapacityFuel() = car.getCapacityFuel() + actualLiterTemp;
        System.out.println();
        System.out.println("น้ำมันที่ต้องการเติม: "+liter);
        System.out.println("น้ำมันที่เติมจริง: "+actualLiterTemp);
        System.out.println("น้ำมันที่เติมได้: "+car.getCapacityFuel());
    }

}
