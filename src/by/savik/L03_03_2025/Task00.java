package by.savik.L03_03_2025;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        test();

        // Две эти строки эквивалентны
        String[] strings = new String[0];
        List<String> stringList1 = new ArrayList<>();

        List<String> stringList2 = new ArrayList<>();

        stringList1.add("Dzianis");
        stringList1.add("Dima");

        stringList2.add("Vova");
        stringList2.add("Olya");

        System.out.println("размер stringlist1 => " + stringList1.size());
        stringList1.addAll(stringList2);
        System.out.println("размер stringlist1 => " + stringList1.size());
        System.out.println(stringList1);

        stringList1.clear();
        System.out.println(stringList1);
        System.out.println(stringList1.size());

        stringList1.add("Denis");
        stringList1.add("Olya");
        boolean isDenisContains = stringList1.contains("Denis");
        System.out.println(isDenisContains);

        boolean containsAll = stringList1.containsAll(stringList2);
        System.out.println(containsAll);

        if (stringList1.isEmpty()) {
            System.out.println();
        }
        if (!stringList1.isEmpty()) {
            System.out.println();
        }

        boolean equals = stringList1.equals(stringList2);
        System.out.println(equals);

        String s = stringList1.get(0);
        System.out.println(s);

        int i = stringList1.indexOf("Olya");
        System.out.println(i);

        stringList1.remove("Denis");
        System.out.println(stringList1);

        stringList1.set(0, "Kate");
        System.out.println(stringList1);

        String[] array = stringList1.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        List<String> k = new ArrayList<>(20);
        System.out.println(k);

    }
        public static void test() {
        Car audi = new Car("Audi", 1988);
        Car bmw = new Car("BMW", 2003);
        List<Car> cars = List.of(audi, bmw);
            System.out.println(cars);
            for (Car car : cars) {
                if (car.getYear() == 2003) {
                    System.out.println(car);
                }
            }
            Iterator<Car> iterator = cars.iterator();
            while (iterator.hasNext()) {
                Car next = iterator.next();
                if (next.getYear() == 2005) {
                    iterator.remove();
                    break;
                }
            }
        }
}
