package org.example.Monday.Abstraction.Animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println(getName() + " is Meowing...");
    }
}
