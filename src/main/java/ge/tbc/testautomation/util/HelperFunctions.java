package ge.tbc.testautomation.util;

import ge.tbc.testautomation.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        double r1 = rectangle1.getPerimeter();
        double r2 = rectangle2.getPerimeter();
        if(r1 > r2) {
            System.out.println("Perimeter1 > Perimeter2");
        } else if (r1 < r2) {
            System.out.println("Perimeter1 < Perimeter2");
        } else {
            System.out.println("Perimeter1 = Perimeter2");
        }
    }
}