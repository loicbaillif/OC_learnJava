package com.loicbaillif.ch1;

import com.loicbaillif.tools.Print;

public class Ch1 {
    public static void main() {
        Print.subtitle("Ch1: Heritage and Polymorphism", '#');
        GeometricShape shape1 = new GeometricShape(2, 5);
        shape1.moveTo(3, -1);
        Square square1 = new Square(-3, -4, -2);
        square1.moveTo(2, 2);
        System.out.println(square1.getSide());
    }

}
