package org.qa.Monday.Abstraction;

import org.qa.Monday.Abstraction.Animals.Animal;
import org.qa.Monday.Abstraction.Animals.Blackbird;
import org.qa.Monday.Abstraction.Animals.Cat;
import org.qa.Monday.Abstraction.Animals.Dog;
import org.qa.Monday.Abstraction.Instruments.Guitar;
import org.qa.Monday.Abstraction.Interfaces.Playable;

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
