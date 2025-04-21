package by.savik.L21_04_2025;

import java.util.*;
import java.util.stream.Collectors;

public class Task00 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rise", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );

        /*sortedMenuNames(menu);
        System.out.println(sortedMenuNames(menu));*/
        //sortedMenuNames через STREAM
        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                /*.limit(3)*/
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                /*.limit(3)*/
                .distinct()
                .forEach(System.out::println);

        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        boolean isVegetarian = menu.stream().anyMatch(Dish::isVegetarian);
        boolean isLower1000 = menu.stream().allMatch(dish -> dish.getCalories() < 1000);
        boolean noneMatch = menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);

        // класс-контейнер Optional
        Optional<Dish> any = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
        if (any.isPresent()) {
            Dish dish = any.get();
            /*Dish dish1 = any.orElse()*/
        }

        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));

        Optional<Dish> first = menu.stream()
                .filter(Dish::isVegetarian)
                .findFirst();

        int sum = menu.stream().mapToInt(Dish::getCalories).sum();
        OptionalInt max = menu.stream().mapToInt(Dish::getCalories).max();
        int i = menu.stream().mapToInt(Dish::getCalories).max().orElse(1);

        Map<Type, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect1);

    }

    // Старый вариант
    private static List<String> sortedMenuNames(List<Dish> menu) {
        List<Dish> filtered = new ArrayList<>();
        List<String> lowCalories = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                filtered.add(dish);
            }
        }
        filtered.sort(Comparator.comparing(Dish::getCalories));
        for (Dish dish : filtered) {
            lowCalories.add(dish.getName());
        }
        return lowCalories;
    }


}
