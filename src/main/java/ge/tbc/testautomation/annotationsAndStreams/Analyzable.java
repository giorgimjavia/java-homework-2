package ge.tbc.testautomation.annotationsAndStreams;

public class Analyzable {
    @VariableNameAnnotation(name = "Score")
    public int score;

    @VariableNameAnnotation(name = "Salary")
    double salary;

    @VariableNameAnnotation
    String college;

    @VariableNameAnnotation(name = "Origin")
    String country;

    @VariableNameAnnotation
    int age;

    @VariableNameAnnotation(name = "Count")
    int count;

    @VariableNameAnnotation(name = "Degree")
    String university;

    @VariableNameAnnotation(name = "Price")
    double price;

    @VariableNameAnnotation
    int year;

    @VariableNameAnnotation(name = "NoActive")
    boolean isActive;
}
