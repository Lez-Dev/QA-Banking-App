package org.example;


import org.example.Monday.Inheritance.Animal;
import org.example.Monday.Inheritance.Blackbird;
import org.example.Monday.Inheritance.Cat;
import org.example.Monday.Inheritance.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rover", false, true, true);
        Dog dog2 = new Dog("Lancy", false, true, true);
        Cat cat = new Cat("Smudge", false, false, true);
        Blackbird blackbird = new Blackbird("Tweety", true, false, true);
        Animal rabbit = new Animal("Buggs", false, false, false);

        Animal[] animalArray = {cat, dog, blackbird, rabbit, dog2};
        //int[] intArray = {1,2,3,4};
        for (Animal animal : animalArray) {
            // This method is inherited from the root Animal class
            animal.eat();

            //Overridden the noise() method
            animal.noise();
        }
    }
}