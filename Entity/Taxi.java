package com.example.demo.Entity;

import lombok.*;

@Data
public class Taxi  {
    private int passenger;
    private double fare;

    public Taxi() {
    }

    public Taxi(int passenger, double fare) {
        this.passenger = passenger;
        this.fare = fare;
    }
    //    public Taxi(int decoy, String color, Gen gen, Drivers driver, double capacityFuel, double capacityCar, double fuelUsage) {
//        super(decoy, color, gen, driver, capacityFuel, capacityCar, fuelUsage);
//    }
//
//    public Taxi(int decoy, String color, Gen gen, Drivers driver, double capacityFuel, double capacityCar, double fuelUsage, int passenger, double fare) {
//        super(decoy, color, gen, driver, capacityFuel, capacityCar, fuelUsage);
//        this.passenger = passenger;
//        this.fare = fare;
//    }


    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }
}
