package ge.tbc.testautomation.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c = new Circle(-25.13);
        } catch (RadiusException radiusE) {
            System.out.println(radiusE.getMessage());
        }

        try {
            Circle c1 = new Circle(17.21);
            Circle c2 = new Circle(5.21);
            Circle c3 = new Circle(52.12);
            Circle c4 = new Circle(32.06);
            Circle c5 = new Circle(10.23);
        } catch (LimitException limitE) {
            System.out.println(limitE.getMessage());
        }

        String text = "Test Automation Bootcamp 12, 2025";
        int start = text.indexOf("Automation");
        int end = start + "Automation".length();
        String automationText = text.substring(start, end).toLowerCase();
        System.out.println(automationText);

        String[] textSplit = text.split(" ");
        for (int i = 0; i < textSplit.length; i++) {
            System.out.println(textSplit[i]);
        }

        int textLength = text.length();
        System.out.println(textLength);

        String textReplace = text.replace(" ", "-");
        System.out.println(textReplace);

        System.out.println(phoneNumberValidation("555123456"));
        System.out.println(phoneNumberValidation("123456789"));

        String[] numbersArray = {
                "599-14-15-16",
                "555-32-04-36",
                "598-59-37-53",
                "123-45-67-89",
                "059-1415-16",
                "355-123-4567",
                "003000323",
                "392131952",
                "595-87-24",
        };

        for (int i = 0; i < numbersArray.length; i++) {
            String phone = numbersArray[i];
            String phoneReplace = phone.replace("-", "");
            boolean numberValidation = phoneNumberValidation(phoneReplace);

            if (numberValidation) {
                System.out.println(phone + " -> Valid");
            } else {
                System.out.println(phone + " -> Invalid");
            }
        }


        // Java-OOP-2 Branch Task
        Rectangle rectangle1 = new Rectangle(32.12, 42.21);
        Rectangle rectangle2 = new Rectangle(23.52, 12.23);
        Triangle triangle1 = new Triangle(5.2, 7.2, 9.1, 12.2);

        System.out.println("Rectangle1 area is: " + rectangle1.getArea());
        System.out.println("Rectangle1 perimeter is: " + rectangle1.getPerimeter());

        System.out.println("Rectangle2 area is: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter is: " + rectangle2.getPerimeter());

        System.out.println("Triangle1 area is: " + triangle1.getArea());
        System.out.println("Triangle1 perimeter is: " + triangle1.getPerimeter());

        HelperFunctions.compareRectangles(rectangle1, rectangle2);
    }

    private static boolean phoneNumberValidation(String number) {
        String regex = "^(555|595|592|599)[0-9]{6}$";

        return number.matches(regex);
    }
}