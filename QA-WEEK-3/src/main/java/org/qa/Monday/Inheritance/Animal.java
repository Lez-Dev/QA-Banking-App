package org.qa.Monday.Inheritance;

public class Animal {
    private String name;
    private boolean canFly;
    private boolean canSwim;
    private boolean isCarnivore;

    public Animal(String name, boolean canFly, boolean canSwim, boolean isCarnivore) {
        this.name = name;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.isCarnivore = isCarnivore;
    }

    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void noise() {
        System.out.println(getName() + " is Growling...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }
}
