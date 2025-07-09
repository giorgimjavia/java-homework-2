package ge.tbc.testautomation.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figure implements IResizable, IValidFigure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle (double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a * h) / 2;
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void doubleSize() {
        a *= 2;
        b *= 2;
        c *= 2;
        h *= 2;
    }

    @Override
    public void customSize(double byValue) {
        a *= byValue;
        b *= byValue;
        c *= byValue;
        h *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return a + b > c && a + c > b && b + c > a;
    }
}