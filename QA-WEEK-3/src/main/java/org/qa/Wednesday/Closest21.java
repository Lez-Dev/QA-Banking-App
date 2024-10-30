package org.qa.Wednesday;

public class Closest21 {
    public static void main(String[] args) {
        int a = 19; // Example input
        int b = 22; // Example input

        int result = closestTo21(a, b);
        System.out.println("Result: " + result);
    }

    public static int closestTo21(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else {
            return (21 - a < 21 - b) ? a : b;
        }
    }
}
