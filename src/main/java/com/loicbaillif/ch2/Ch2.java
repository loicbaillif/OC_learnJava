package com.loicbaillif.ch2;

import com.loicbaillif.tools.Print;

import java.util.*;

public class Ch2 {
    private final static String K_MARIE = "Marie";
    private final static String K_MAYTE = "Mayte";

    public static void main() {
        Print.title("Ch2: Handle data stacks", '#');

        Print.subtitle("Arrays");
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

        Print.subtitle("Exercise on Arrays");
        // Let's consider 30 seats on first row
        String[] firstRow = new String[30];
        firstRow[17] = "Terry Nator";



        Print.subtitle("Lists");
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


        Print.subtitle("Sets");
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


        Print.subtitle("Maps");
        System.out.println("Association {key: value}");
        System.out.println("Key is often a String");
        Map<String, Integer> friendsBirthyear = new HashMap<String, Integer>();
        friendsBirthyear.put("Sophie", 1986);
        friendsBirthyear.put("Florian", 1982);
        friendsBirthyear.put("Christophe", 1989);
        System.out.println(friendsBirthyear.get("Sophie"));
        friendsBirthyear.put("florian", 1999);
        System.out.printf("Florian birth year: %d%n",
                friendsBirthyear.get("Florian"));
        System.out.printf("florian birth year: %d%n",
                friendsBirthyear.get("florian"));
        // Tip: use constants instead of direct String
        // See private static final variables in Class
        friendsBirthyear.put(K_MARIE, 1961);
        friendsBirthyear.put(K_MAYTE, 1969);
        System.out.printf("%s birth year: %d%n",
                K_MARIE,
                friendsBirthyear.get(K_MARIE));
        System.out.printf("%s birth year: %d%n",
                K_MAYTE,
                friendsBirthyear.get(K_MAYTE));
        // Key type can also be an Integer;
        Map<Integer, String> morningTasks = new HashMap<Integer, String>();
        morningTasks.put(0, "Open eyes.");
        morningTasks.put(1, "Acknowledge the alarm");
        morningTasks.put(2, "Prepare coffee");
        morningTasks.put(3, "Have a shower");
        morningTasks.put(4, "Get dressed");
        morningTasks.put(5, "Watch TV");
        for (int i = 0; i < morningTasks.size(); i++) {
            System.out.printf("\tTask %d: %s%n", i, morningTasks.get(i));
        }
        System.out.println("To reassign a value: use put() on its key");
        morningTasks.put(0, "Stop dreaming.");
        morningTasks.remove(5);
        for (int i = 0; i < morningTasks.size(); i++) {
            System.out.printf("\tTask %d: %s%n", i, morningTasks.get(i));
        }

        Print.subtitle("Summary");
        System.out.println(". Array: \n\t- Fixed size container");
        System.out.println("\t- Elements have index starting from 0");
        System.out.println("\n. Lists: \n\t- Similar to array");
        System.out.println("\t- Elements can be added or deleted");
        System.out.println("\n. Sets: \n\t- Elements are unordered.");
        System.out.println("\t- They can be accessed via enumeration");
        System.out.println("\n. Maps:");
        System.out.println("\t- Elements are organized as key/value pair");
        System.out.println("\t- Elements are accessible via their key");
        System.out.println("\n. Most common actions:");
        System.out.println("\t- get(): Access an element");
        System.out.println("\t- put(): Add a new element");
        System.out.println("\t- remove(): Remove an element");
        System.out.println("\t- xxx: Modify an element (variable)");
        System.out.println("\t- xxx.size(): Count elements");
        System.out.println("\t- for loops: loop through elements");

        Print.subtitle("End of chapter 2");
    }

}
