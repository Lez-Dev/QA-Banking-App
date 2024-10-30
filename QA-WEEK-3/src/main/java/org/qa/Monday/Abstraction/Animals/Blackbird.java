package org.qa.Monday.Abstraction.Animals;

public class Blackbird extends Animal {

    public Blackbird(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println(getName() + " is tweeting...");
    }
}
