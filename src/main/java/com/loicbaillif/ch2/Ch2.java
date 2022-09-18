package com.loicbaillif.ch2;

import com.loicbaillif.tools.Print;

public class Ch2 {
    public static void main() {
        Print.subtitle("Ch2: Handle data stacks");

        System.out.println("***** Arrays *****");
        int[] cupsOfCoffeePerWeek; // From monday to sunday
        cupsOfCoffeePerWeek = new int[7];
        int[] daysPerMonth = new int[12];
        daysPerMonth[1] = 28; // February
        System.out.printf("Month n°2 has %d days", daysPerMonth[1]);
    }

}
