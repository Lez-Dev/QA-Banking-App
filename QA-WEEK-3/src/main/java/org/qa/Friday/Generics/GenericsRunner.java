package org.qa.Friday.Generics;

public class GenericsRunner {
    public static void main(String[] args) {
        // Type safety, re-usability, elimination of type-casting

        // This is the generic class instantiated for String
        GenericExample<String> genericString = new GenericExample<>("This is a generic string");
        System.out.println("String class: " + genericString);

        GenericExample<Integer> genericInteger = new GenericExample<>(12345);

        System.out.println("Integer class: " + genericInteger);
    }
}
