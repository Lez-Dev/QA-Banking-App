package org.example.Tasks;

import org.example.Vehicles.Car;

public class ArraysStringsTask {
    public static void main(String[] args) {
        // Create an array for instances of your type
        Car car1 = new Car("ABC123", "VW", "Hybrid");
        Car car2 = new Car("ABC124", "Vauxhall", "Petrol");
        Car car3 = new Car("ABC1253", "Toyota", "Diesel");
        Car car4 = new Car("ABC1213", "BMW", "Petrol");

        Car[] carArray = {car1, car2, car3, car4};

        // Use an enhanced loop (for each) to iterate over the array
        for (Car car : carArray) {
            System.out.println(car.toString());
        }

        // Use a for loop to iterate over the array
        for (int i = 0; i < carArray.length ; i++) {
            System.out.println(carArray[i].toString());
        }

        Car[][] carOfCarsArray = {{car1, car2},{car3, car4}};

        for (int i = 0 ; i < carOfCarsArray.length; i++) {
            for (int j = 0 ; j < carOfCarsArray[i].length; j++) {
                System.out.println(carOfCarsArray[i][j]);
            }
        }

    }
}
