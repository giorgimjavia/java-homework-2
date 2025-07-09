package ge.tbc.testautomation.runners;
import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hot Fix");
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());
        circle.doubleSize();
        System.out.println("Circle Double Size Is: " + circle.getArea());
        circle.customSize(2.5);
        System.out.println("Circle Costume Size Is: " + circle.getLength());
        System.out.println(circle.validateFigure());
        circle.printPackageName();

        Triangle triangle = new Triangle(3, 4, 5, 9);
        System.out.println("Triangle Area: " + triangle.getArea());
        triangle.doubleSize();
        System.out.println("Triangle Double Size Is: " + triangle.getArea());
        triangle.customSize(1.5);
        System.out.println("Triangle Costume Size Is : " + triangle.getLength());
        System.out.println(triangle.validateFigure());
        triangle.printPackageName();


    }


}