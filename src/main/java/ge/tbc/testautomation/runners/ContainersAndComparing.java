package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("555-542-231");
        numbers.add("555-887-987");
        numbers.add("555-161-143");
        numbers.add("555-189-6667");

        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            String phone = iterator.next();
            System.out.println(phone);
        }


        HashMap<String, String> numberUsers = new HashMap<>();
        Iterator<String> iterator_map = numbers.iterator();
        numberUsers.put("გიორგი", iterator_map.next());
        numberUsers.put("ალექსანდრე", iterator_map.next());
        numberUsers.put("სალომე", iterator_map.next());
        numberUsers.put("დავითი", iterator_map.next());

        for (String name : numberUsers.keySet()) {
            String phone = numberUsers.get(name);
            if(phone.contains("8")) {
                System.out.println(name + " : " + phone);
            }
        }

        Set<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(3));
        treeSet.add(new Circle(5));
        treeSet.add(new Circle(1));
        treeSet.add(new Circle(5));
        treeSet.add(new Circle(2));
        treeSet.add(new Circle(9));
        treeSet.add(new Circle(11));
        treeSet.add(new Circle(3));
        treeSet.add(new Circle(12));
        treeSet.add(new Circle(36));
        Iterator<Circle> iterator_tree = treeSet.iterator();
        while (iterator_tree.hasNext()) {
            Circle c = iterator_tree.next();
            System.out.println("TreeSet " + c);
        }


        Set<Circle> circleSet = new HashSet<>();
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(2));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(2));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(2));
        circleSet.add(new Circle(5));
        Iterator<Circle> iterator_hash = circleSet.iterator();
        while (iterator_hash.hasNext()) {
            Circle c = iterator_hash.next();
            System.out.println("HashSet " + c);
        }

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(30, 54));
        rectangles.add(new Rectangle(2, 6));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(1, 10));
        rectangles.add(new Rectangle(23, 15));
        rectangles.add(new Rectangle(11, 7));
        rectangles.add(new Rectangle(8, 19));
        rectangles.add(new Rectangle(11, 7));
        rectangles.add(new Rectangle(8, 19));

        rectangles.sort(new Rectangle.ReverseAreaComparator());

        Iterator<Rectangle> iterator_rect = rectangles.iterator();
        while (iterator_rect.hasNext()) {
            Rectangle r = iterator_rect.next();
            System.out.println(r);
        }
    }
}
