package com.loicbaillif.ch3;

import com.loicbaillif.tools.Print;

public class Ch3 {
    public static void main() {
        Print.title("Ch3: Ways to pass parameters");

        displayPerimeter(3, 5);
        int[] rectangle1 = {3, 2};
        int[] rectangle2 = {6, 1};
        int[] rectangle3 = {2, 9};
        int[] rectangle4 = {5, 5};
        int[][] rectangles = {rectangle1, rectangle2, rectangle3, rectangle4};
        for (int[] rectangle:
             rectangles) {
            System.out.printf("Rectangle: width = %d - height = %d => " +
                    "Perimeter = %d%n",
                    rectangle[0],
                    rectangle[1],
                    calculatePerimeter(rectangle[0], rectangle[1]));
        }

        Print.subtitle("Reference types");
        Car car1 = new Car();
        Car car2 = car1;
        System.out.printf("\t- car1.colour = %s%n", car1.colour);
        System.out.printf("\t- car2.colour = %s%n", car2.colour);
        car1.colour = "green";
        System.out.println("car1.colour = \"green\";");
        System.out.printf("\t- car1.colour = %s%n", car1.colour);
        System.out.printf("\t- car2.colour = %s%n", car2.colour);
        car2.colour = "blue";
        System.out.println("car2.colour = \"blue\";");
        System.out.printf("\t- car1.colour = %s%n", car1.colour);
        System.out.printf("\t- car2.colour = %s%n", car2.colour);


        Print.subtitle("Summary");
        System.out.println("Methods can have parameters and returned value");
        System.out.println("Returned value is, in most cases, the result of " +
                "function execution. It is returned to the mother block " +
                "which called the function, and re-used from there.");
        System.out.println("Parameters are inputs for a function, needed " +
                "to determine its result.");
        System.out.println("Parameters are variables defined by a name and " +
                "a type. They are specified in the method declaration.");

        Print.subtitle("End of chapter 3");
    }

    public static void displayPerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.printf("Perimeter = %d%n", perimeter);
    }

    public static int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}
