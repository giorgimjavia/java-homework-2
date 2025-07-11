package ge.tbc.testautomation.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figure implements IResizable, IValidFigure {
    private double radius;

    public Circle(double radius) {
        if (numberOfInstances > 5) {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }

        if (radius <= 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

        this.radius = radius;

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public double getPerimeter() {
        return getLength();
    }

    @Override
    public void doubleSize() {
        radius *= 2;
    }

    @Override
    public void customSize(double byValue) {
        radius *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }
}
