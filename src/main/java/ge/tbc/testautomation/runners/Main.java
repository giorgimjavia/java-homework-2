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

        List<Field> annotatedFields = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class)).collect(Collectors.toList());

        List<Field> match = annotatedFields.stream()
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    return field.getName().equalsIgnoreCase(annotation.name());
                })
                .collect(Collectors.toList());

        List<Field> no_match = annotatedFields.stream()
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    return !field.getName().equalsIgnoreCase(annotation.name());
                })
                .collect(Collectors.toList());

        System.out.println("Annotations are matching: ");
        for (Field field : match) {
            String annotationName = field.getAnnotation(VariableNameAnnotation.class).name();
            System.out.println(field.getName() + " annotation: " + annotationName);
        }

        System.out.println("\nAnnotations aren't matching: ");
        for (Field field : no_match) {
            String annotationName = field.getAnnotation(VariableNameAnnotation.class).name();
            System.out.println(field.getName() + " annotation: " + annotationName);
        }

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