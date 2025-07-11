package ge.tbc.testautomation.figures;

public abstract class Figure {
    public static int numberOfInstances;

    public Figure() {
        ++numberOfInstances;
    }

    public abstract double getArea();

    public abstract double getLength();
    
    public abstract void printPackageName();

    public abstract double getPerimeter();
}
