package ge.tbc.testautomation.figures;

import java.util.Comparator;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return  a*  b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public String toString() {
        return "Rectangle " + a + " * " + b + ", area = " + getArea();
    }

    public static class ReverseAreaComparator implements Comparator<Rectangle> {
        @Override
        public int compare(Rectangle r1, Rectangle r2) {
            return Double.compare(r2.getArea(), r1.getArea());
        }}}