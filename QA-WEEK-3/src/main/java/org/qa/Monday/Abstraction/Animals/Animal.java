package org.qa.Monday.Abstraction.Animals;

public abstract class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;

    }

    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void noise() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
