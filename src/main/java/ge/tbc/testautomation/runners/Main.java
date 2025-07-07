package ge.tbc.testautomation.runners;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(32.12, 42.21);
        Rectangle rectangle2 = new Rectangle(23.52, 12.23);
        Triangle triangle1 = new Triangle(5.2, 7.2, 9.1, 12.2);

        System.out.println("Rectangle1 area is: " + rectangle1.getArea());
        System.out.println("Rectangle1 perimeter is: " + rectangle1.getPerimeter());

        System.out.println("Rectangle2 area is: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter is: " + rectangle2.getPerimeter());

        System.out.println("Triangle1 area is: " + triangle1.getArea());
        System.out.println("Triangle1 perimeter is: " + triangle1.getPerimeter());

        HelperFunctions.compareRectangles(rectangle1, rectangle2);
    }
}