package org.example.Strings;

public class StringRunner {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder);

        //append
        stringBuilder.append("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append(" World!");
        System.out.println(stringBuilder);

        //insert
        // 2 arguments, where you want to insert the data, and what is the data
        stringBuilder.insert(5, " my");
        System.out.println(stringBuilder);

        //replace, starting int is inclusive, ending int is exclusive
        stringBuilder.replace(0, 5, "Goodbye");
        System.out.println(stringBuilder);

        //delete
        stringBuilder.delete(0, 8);
        System.out.println(stringBuilder);

        //toString
        String newStringLiteral = stringBuilder.toString();
        System.out.println(newStringLiteral);

    }
}
