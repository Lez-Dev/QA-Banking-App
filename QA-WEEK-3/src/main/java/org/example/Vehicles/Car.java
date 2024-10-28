package org.example.Vehicles;

public class Car {
    public Car(String regNo, String make, String fuelType, int yearOfSale) {
        this.regNo = regNo;
        this.make = make;
        this.fuelType = fuelType;
        this.yearOfSale = yearOfSale;
    }

    public Car(String regNo, String make, String fuelType) {
        this(regNo, make, fuelType, 2024);
    }

    String regNo;
    String make;
    String fuelType;
    int yearOfSale;

    String colour;

    @Override
    public String toString() {
        return "Car{" +
                "regNo='" + regNo + '\'' +
                ", make='" + make + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", yearOfSale=" + yearOfSale +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYearOfSale() {
        return yearOfSale;
    }

    public void setYearOfSale(int yearOfSale) {
        this.yearOfSale = yearOfSale;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
