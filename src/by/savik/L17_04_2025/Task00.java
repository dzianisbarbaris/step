package by.savik.L17_04_2025;

import by.savik.L14_04_2025.Apple;
import by.savik.L14_04_2025.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Task00 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("Денис");
        list.add("Барбарис");
        list.add("Кипарис");

        forEach(list, s -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
        list.forEach(s -> list2.add(s + " Петрович"));
        System.out.println(list2);
        forEach(list, s -> list2.add(s + " Иваненко"));
        System.out.println(list2);
        List<Integer> maplist = map(list, s -> s.length());
        System.out.println(maplist);
        List<Apple> applesList = List.of(new Apple(100, Color.RED),
                new Apple(200, Color.GREEN), new Apple(300, Color.YELLOW),
                new Apple(400, Color.GREEN), new Apple(500, Color.RED));
        List<Color> colorList = map(applesList, s -> s.getColour());
        System.out.println(colorList);
        Random r = new Random();

        //Supplier для создания обьектов. принимает обобщ. тип Т и возвращает void
        Supplier<Integer> supplier = () -> r.nextInt(100);
        System.out.println(supplier.get());

        int a = 10;
        Runnable runnable = () -> System.out.println(a);

        //Ссылки на методы: 3 основных типа
        //1 - ссылка на статические методы

        //2 - ссылки на методы экземпляра произвольного типа

        //3 - ссылки на методы экземпляра существующего метода или выражения
        List<Color> map = map(applesList, Apple::getColour);
        List<Integer> appleWeight = map(applesList, Apple::getWeight);
        applesList.forEach(System.out::println);
        // ссылки на конструкторы
        Supplier<Apple> s = Apple::new;
        Apple apple = s.get();
        BiFunction<Integer, Color, Apple> bf = Apple::new;
        bf.apply(110, Color.GREEN);


        //Comparator
        applesList.sort(( o1,  o2) -> o1.getWeight().compareTo(o2.getWeight()));
        Comparator<Apple> comparing = Comparator.comparing((Apple a3) -> a3.getWeight());
        applesList.sort(comparing);
        applesList.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColour));
        Predicate<Apple> predicate = (Apple a4) -> a4.getWeight() == 100;
        predicate.and( a5 -> a5.getColour().equals(Color.GREEN));
    }

    //Consumer для доступа к объекту типа Т и выполнения над ним каких либо операций

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    //Function - у него есть 1 абстр. метод "apply" принимающий на вход обьект обобщенного типа Т
    //                                и возвращающий обьект обобщенного типа R.
    public static <T, R> List<R> map(List<T> list, Function<T, R> f){
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }


}
