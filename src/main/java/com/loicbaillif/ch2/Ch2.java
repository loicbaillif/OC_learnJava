package com.loicbaillif.ch2;

import com.loicbaillif.tools.Print;

public class Ch2 {
    public static void main() {
        Print.subtitle("Ch2: Handle data stacks");

        System.out.println("***** Arrays *****");
        int[] cupsOfCoffeePerWeekday; // From monday to sunday
        cupsOfCoffeePerWeekday = new int[7];
        int[] daysPerMonth = new int[12];
        cupsOfCoffeePerWeekday[1] = 2; // Tuesday
        System.out.printf("On Tuesday, I have %d cups of coffee%n",
                cupsOfCoffeePerWeekday[1]);
        daysPerMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < daysPerMonth.length; i++) {
            System.out.printf("Month n°%d has %d days.%n",
                    i + 1,
                    daysPerMonth[i]);
        }

        System.out.println("***** Exercise on Arrays *****");
        
    }

}
