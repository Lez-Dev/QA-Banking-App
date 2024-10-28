package org.example.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        // Ordered collection of values
        // Fixed data type and is contiguously held in memory
        // Pre-defined size

        char[] helloArray = {'H', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        // Single-dimensional array
        String[] singleDiArray;

        // Multi-dimensional array
        String[][] multiDiArray;

        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] numMultiArray = {{2, 4, 6, 8}, {1, 3, 5, 7}, {11, 12, 13, 14}};
        int[][] sameAS = new int[3][4];


        // looping through arrays:
        // for loop and enhanced for loop/foreach loop

        //For Loop
        for(int i = 0; i < numArray.length; i++){
            int j = numArray[i];
        }
    }
}
