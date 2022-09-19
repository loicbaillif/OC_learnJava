package com.loicbaillif.ch2;

import com.loicbaillif.tools.Print;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ch2 {
    public static void main() {
        Print.subtitle("Ch2: Handle data stacks", '#', true);

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
        // Let's consider 30 seats on first row
        String[] firstRow = new String[30];
        firstRow[17] = "Terry Nator";

        System.out.println("\n***** Lists *****");
        System.out.println("2 advantages:\n\t- fixed size");
        System.out.println("\t- Only existing values can be modified");
        List<Integer> booksPerLibrary = new ArrayList<Integer>();
        booksPerLibrary.add(32123);
        if (booksPerLibrary.add(13579)) {
            System.out.println("Library corrected added to ArrayList");
        }
        for (int nbBooks: booksPerLibrary) {
            System.out.println("\t" + nbBooks);
        }
        System.out.println("After adding new value at index 0:");
        booksPerLibrary.add(0, 525);
        for (int nbBooks: booksPerLibrary) {
            System.out.println("\t" + nbBooks);
        }
        System.out.println("We will now replace an element by another value");
        booksPerLibrary.set(1, 32100);
        for (int nbBooks: booksPerLibrary) {
            System.out.println("\t" + nbBooks);
        }
        System.out.println("Finally, we delete first element.");
        System.out.printf("Size before removal: %d%n", booksPerLibrary.size());
        booksPerLibrary.remove(0);
        System.out.printf("Size after removal: %d%n", booksPerLibrary.size());
        for (int nbBooks: booksPerLibrary) {
            System.out.println("\t" + nbBooks);
        }


        System.out.println("\n***** Sets *****");
        System.out.println("used for unordered items.");
        Set<String> townsInFrance = new HashSet<String>();
        System.out.println("Same basic actions as List:");
        System.out.println("\tadd()\n\tremove()\n\tsize()");
        System.out.println("Set is not ordered ==> set() does not exist");
        townsInFrance.add("Carentan");
        townsInFrance.add("Rocamadour");
        townsInFrance.add("Nordheim");
        townsInFrance.add("Cabourg");
        System.out.printf("townsInFrance contains %d elements:%n",
                townsInFrance.size());
        for (String town: townsInFrance) {
            System.out.printf("\t- %s%n", town);
        }
        townsInFrance.remove("Rocamadour");
        System.out.printf("townsInFrance contains %d elements:%n",
                townsInFrance.size());
        for (String town: townsInFrance) {
            System.out.printf("\t- %s%n", town);
        }
    }

}
