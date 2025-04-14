package by.savik.L14_04_2025;

import by.savik.L14_04_2025.impl.AppleGreenColourPredicate;
import by.savik.L14_04_2025.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

// Java 8
public class Task00 {
    public static void main(String[] args) {
        List<Apple> applesList = List.of(new Apple(100, Color.RED),
                new Apple(200, Color.GREEN), new Apple(300, Color.YELLOW),
                new Apple(400, Color.GREEN), new Apple(500, Color.RED));

        List<Apple> colourApples = filterColourApples(applesList, Color.RED);
        System.out.println(colourApples);
        List<Apple> heavyApples = filterWeightApples(applesList, 250);
        System.out.println(heavyApples);
        List<Apple> predicateApples = filterApplesPredicate(applesList, new AppleGreenColourPredicate());
        System.out.println(predicateApples);

        filterApplesPredicate(applesList, new ApplePredicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return Color.GREEN.equals(apple.getColour());
            }
        });

        filterApplesPredicate(applesList, (apple) -> Color.GREEN.equals(apple.getColour()));
        List<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> int2 = filterApplesPredicate(integers, (Integer integer) -> (integer % 2 == 0));
        System.out.println(int2);
    }

    private static List<Apple> filterColourApples(List<Apple> apples, Color color) {
        List<Apple> colourApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (color.equals(apple.getColour())) {
                colourApples.add(apple);
            }
        }
        return colourApples;
    }

    private static List<Apple> filterWeightApples(List<Apple> apples, int weight) {
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

    private static List<Apple> filterApples(List<Apple> apples, int weight, Color color, boolean flag) {
        List<Apple> sortedApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (flag && color.equals(apple.getColour()) || (!flag && apple.getWeight() > weight)) {
                sortedApples.add(apple);
            }
        }
        return sortedApples;
    }

    private static <T> List<T> filterApplesPredicate(List<T> harvest, ApplePredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : harvest) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
