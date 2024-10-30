package org.qa.Monday.Abstraction.Animals;

import org.qa.Monday.Abstraction.Interfaces.Playable;

public class Dog extends Animal implements Playable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println(getName() + " is barking...");
    }

    @Override
    public void play() {
        System.out.println("Playing ball with the dog.");
    }
}
