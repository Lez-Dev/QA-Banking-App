package org.qa.Monday.Inheritance;

public class Cat extends Animal{
    public Cat(String name, boolean canFly, boolean canSwim, boolean isCarnivore) {
        super(name, canFly, canSwim, isCarnivore);
    }

    @Override
    public void noise() {
        System.out.println(getName() + " is Meowing...");
    }
}
