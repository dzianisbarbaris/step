package by.savik.L21_04_2025;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Dish> menu2 = Arrays.asList(
                new Dish("pork2", false, 600, Type.MEAT),
                new Dish("beef2", false, 800, Type.MEAT),
                new Dish("chicken2", false, 500, Type.MEAT),
                new Dish("french fries2", true, 330, Type.OTHER),
                new Dish("rise2", true, 250, Type.OTHER),
                new Dish("season fruit2", true, 120, Type.OTHER),
                new Dish("pizza2", true, 450, Type.OTHER),
                new Dish("prawns2", false, 200, Type.FISH),
                new Dish("salmon2", false, 250, Type.FISH)
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


        //24.04.2025
        List<List<Dish>> listList = List.of(menu, menu2);
        List<Dish> collect2 = listList.stream()
                .map(Collection::stream)
                .flatMap(Stream::distinct)
                .collect(Collectors.toList());
        listList.stream()
                .flatMap(l -> l.stream())
                .toList(); //вернёт неизменяемую коллекцию

        int[] nums = {1, 2, 3, 4, 5};
        int sum1 = Arrays.stream(nums).sum();

        Dish nullDish = null;
        Stream.of("home", "java", "dish", "javascript")
                .map(String::toUpperCase)
                .forEach(System.out::println);
        Stream.empty();
        Stream.ofNullable(nullDish).map(Dish::getCalories)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
        Stream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(5).forEach(System.out::println);

        String stringDishNames = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println(stringDishNames);
        Long namesNum = menu.stream().map(Dish::getName).collect(Collectors.counting());
        System.out.println(namesNum);

        Optional<Dish> collect3 = menu.stream().
                collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));
        Integer collect4 = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        Double collect5 = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));

        IntSummaryStatistics statistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(statistics.getMax());

        int sum2 = menu.stream().mapToInt(Dish::getCalories).sum();

        Map<String, List<Dish>> collect6 = menu.stream().collect(Collectors.groupingBy(Dish::getName));

        Map<String, List<Dish>> collect7 = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "DIET";
            } else if (dish.getCalories() <= 700) {
                return "Normal";
            } else {
                return "FAT";
            }
        }));

        Map<Type, List<Dish>> typeToListDishMoreThen500 =
                menu.stream().filter(dish -> dish.getCalories() > 500)
                        .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(typeToListDishMoreThen500);

        Map<Type, List<Dish>> collect8 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.filtering(dish -> dish.getCalories() > 500,
                                Collectors.toList())));
        System.out.println(collect8);

        Map<Type, Long> dishesNum = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(dishesNum);

        Map<Type, Dish> mapDish = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Dish::getCalories)),
                        Optional::get)));
        System.out.println(mapDish);

        Optional<Integer> i1 = Optional.ofNullable(nullDish).map(Dish::getCalories);
        System.out.println(i1);

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
