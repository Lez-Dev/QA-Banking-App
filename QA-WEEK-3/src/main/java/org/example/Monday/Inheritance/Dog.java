package org.example.Monday.Inheritance;

public class Dog extends Animal {
    public Dog(String name, boolean canFly, boolean canSwim, boolean isCarnivore) {
        super(name, canFly, canSwim, isCarnivore);
    }

    @Override
    public void noise() {
        System.out.println(getName() + " is barking...");
    }
}
