package com.example.demo.Entity;

import lombok.*;

@Data
public class Gen {
    private String modelName;
    private int yearOfManufacture;
    private String licensePlate;

    public Gen() {
    }

    public Gen(String modelName, int yearOfManufacture, String licensePlate) {
        this.modelName = modelName;
        this.yearOfManufacture = yearOfManufacture;
        this.licensePlate = licensePlate;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
