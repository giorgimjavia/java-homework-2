package ge.tbc.testautomation.figures;

public abstract class Figure {
    public static int numberOfInstances;

    public Figure() {
        ++numberOfInstances;
    }

    public  double getArea() {
        return -1.0;
    };

    public  double getPerimeter() {
        return -1.0;
    }
}
