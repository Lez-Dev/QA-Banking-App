package org.example;


import org.example.Vehicles.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("AB123DE", "Peugeot", "Hybrid", 2023);
        Car car2 = new Car("FH123GZ", "VW", "Petrol");

        System.out.println(car1.toString());
        System.out.println(car2.toString());

        car2.setColour("Blue");
        System.out.println(car2.toString());


    }
}