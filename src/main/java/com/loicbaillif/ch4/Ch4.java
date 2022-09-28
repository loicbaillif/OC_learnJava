package com.loicbaillif.ch4;

import com.loicbaillif.tools.Print;

public class Ch4 {
    public static void main() {
        Print.title("Ch4: Recursive functions");

        // First example: calculate factorial
        int[] integerArrays = {0, 1, 2, 3, 5, 8};
        for (int element: integerArrays) {
            System.out.printf(". %d! = %d%n", element, factorial(element));
        }

        Print.subtitle("End of chapter 4");
    }


    public static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}
