package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import java.lang.reflect.Field;


public class Main {
    public static void main(String[] args) {
        Integer integer = 20;
        String string = "Text";

        AnyPair<Field[], Field[]> declaredFieldsPair = getDeclaredFields(integer, string);

        System.out.println("Integer Fields:");
        for (Field field : declaredFieldsPair.getElementOne()) {
            System.out.println(field.getName());
        }

        System.out.println("String Fields:");
        for (Field field : declaredFieldsPair.getElementTwo()) {
            System.out.println(field.getName());
        }

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);

        System.out.println(figurePair);
    }
    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }


}