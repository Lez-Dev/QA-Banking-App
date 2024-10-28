package org.example.Monday.Abstraction;

import org.example.Monday.Abstraction.Animals.Animal;
import org.example.Monday.Abstraction.Animals.Blackbird;
import org.example.Monday.Abstraction.Animals.Cat;
import org.example.Monday.Abstraction.Animals.Dog;
import org.example.Monday.Abstraction.Instruments.Guitar;
import org.example.Monday.Abstraction.Interfaces.Playable;

public class AbstractionRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Rover");
        Cat cat = new Cat("Snowball");
        Blackbird blackbird = new Blackbird("Paul");


        Animal[] animalArray = {dog, cat, blackbird};
        for (Animal animal : animalArray) {
            animal.eat();
            animal.noise();
        }

        Guitar guitar = new Guitar("Acoustic");

        Playable[] playableArray = {dog, guitar};
        for (Playable playable : playableArray) {
            playable.play();
        }



    }

}
