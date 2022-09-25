package com.loicbaillif.ch3;

import com.loicbaillif.tools.Print;

public class Ch3 {
    public static void main() {
        Print.title("Ch3: Ways to pass parameters");

        displayPerimeter(3, 5);

        Print.subtitle("End of chapter 3");
    }

    public static void displayPerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.printf("Perimeter = %d%n", perimeter);
    }
}
