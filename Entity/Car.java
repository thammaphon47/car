package com.example.demo.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Data
@Entity
public class Car {
    private int decoy;
    private String color;
    private Gen gen;
    private Drivers driver;
    private double capacityFuel;
    private double capacityCar;
    private double fuelUsage;


    public Car() {
    }

    public Car(int decoy, String color, Gen gen, Drivers driver, double capacityFuel, double capacityCar, double fuelUsage) {
        this.decoy = decoy;
        this.color = color;
        this.gen = gen;
        this.driver = driver;
        this.capacityFuel = capacityFuel;
        this.capacityCar = capacityCar;
        this.fuelUsage = fuelUsage;
    }

    public int getDecoy() {
        return decoy;
    }

    public void setDecoy(int decoy) {
        this.decoy = decoy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }

    public double getCapacityFuel() {
        return capacityFuel;
    }

    public void setCapacityFuel(double capacityFuel) {
        this.capacityFuel = capacityFuel;
    }

    public double getCapacityCar() {
        return capacityCar;
    }

    public void setCapacityCar(double capacityCar) {
        this.capacityCar = capacityCar;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }
}
