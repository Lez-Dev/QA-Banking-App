package org.qa.Friday.Generics;

public class GenericExample<T> {

    //private int age;
    // With generics, we don't use data types we use 'T'.
    private T item;

    public GenericExample(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "GenericExample{" +
                "item=" + item +
                '}';
    }
}
