package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Field[] fields = Analyzable.class.getDeclaredFields();

        List<String> match = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    return field.getName().equalsIgnoreCase(annotation.name());
                })
                .map(Field::getName)
                .collect(Collectors.toList());

        List<String> no_match = Arrays.stream(fields)
                .filter(field ->  field.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    return !field.getName().equalsIgnoreCase(annotation.name());
                })
                .map(Field::getName)
                .collect(Collectors.toList());

        System.out.println("Annotations are matching " + match);
        System.out.println("Annotations aren't matching" + no_match);

        @SuppressWarnings("unused")
        double points = 46.28;

        @SuppressWarnings("unused")
        int number = 50;

        @SuppressWarnings("unused")
        boolean isUnused = false;

        @SuppressWarnings("unused")
        String text = "text";


    }


}