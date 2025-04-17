package by.savik.L14_04_2025HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task00 {
    public static void main(String[] args) {

        //Проверка списка на наличие хотя бы одного элемента
        boolean any = anyMatch(List.of("Иван", "Настя", "Анна", "Олег"), (String string) -> (string.startsWith("А")));
        System.out.println(any);

        //Проверка всех элементов на условие
        boolean all = allMatch(List.of(1, -20, 100, 51, 33), (Integer integer) -> (integer > 0));
        System.out.println(all);

        //Поиск элемента по предикату
        List<String> matchWords = findFirstMatch(List.of("Python", "C++", "Java", "Java Script"), (String string) -> (string.contains("Java")));
        System.out.println(matchWords);

        //Фильтрация строк по длине (Predicate + Lambda)
        List<String> list = new ArrayList<>(List.of("Александра", "Иван", "Анжела", "Зоя"));
        filter(list, (string) -> (string.length() > 5));
        System.out.println(list);

        //Поиск минимального из двух элементов
        int i = min(30, 20);
        System.out.println(i);

        //Вернуть первый элемент
        String firstString = getFirst(List.of("Александра", "Иван", "Анжела", "Зоя"));
        System.out.println(firstString);

        //Вывод элементов массива любого типа
        String[] aray = {"Александра", "Иван", "Анжела", "Зоя"};
        printArray(aray);

        //Подсчёт количества вхождений элемента
        int count = countList(List.of("Александра", "Иван", "Анжела", "Зоя", "Иван", "Иван"), "Иван");
        System.out.println(count);

        //Проверка наличия элемента в массиве
        boolean arrayElement = isElement(aray, "Анжела");
        System.out.println(arrayElement);

        //Создание списка из массива
        List<String> listFromArray = arrayToList(aray);
        System.out.println(listFromArray);

        //Копирование содержимого одного списка в другой
        List<String> list1 = new ArrayList<>(List.of("Александра", "Иван", "Анжела", "Зоя"));
        List<String> list2 = new ArrayList<>(List.of("Фёдор", "Семён", "Оля", "Марина"));
        List<String> copiedList = copyList(list1, list2);
        System.out.println(copiedList);

        //Нахождение индекса элемента
        int index = findElement(aray, 1);
        System.out.println(index);

        //Объединение двух списков
        mergeLists(List.of("Александра", "Иван", "Анжела", "Зоя"), List.of(1, -20, 100, 51, 33));
        System.out.println(mergeLists(List.of("Александра", "Иван", "Анжела", "Зоя"), List.of(1, -20, 100, 51, 33)));
    }

    //Проверка списка на наличие хотя бы одного элемента
    private static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) {
                return true;
            }
        }
        return false;
    }

    //Проверка всех элементов на условие
    private static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }

    //Поиск элемента по предикату
    private static <T> List<T> findFirstMatch(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    //Фильтрация строк по длине (Predicate + Lambda)
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        list.removeIf((T t) -> !predicate.test(t));
        return list;
    }

    //Вернуть первый элемент
    private static <T> T getFirst(List<T> list) {
        return list.getFirst();
    }

    //Поиск минимального из двух элементов
    private static <T extends Comparable<T>> T min(T one, T two) {
        int i = one.compareTo(two);
        if (i > 0) {
            return two;
        } else return one;
    }

    //Вывод элементов массива любого типа
    private static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    //Подсчёт количества вхождений элемента
    private static <T> int countList(List<T> list, T t) {
        int count = 0;
        for (T element : list) {
            if (t.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //Проверка наличия элемента в массиве
    private static <T> boolean isElement(T[] array, T t) {
        for (T element : array) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }

    //Создание списка из массива
    private static <T> List<T> arrayToList(T[] array) {
        List<T> result = new ArrayList<>();
        for (T t : array) {
            result.add(t);
        }
        return result;
    }

    //Копирование содержимого одного списка в другой
    private static <T> List<T> copyList(List<T> list1, List<T> list2) {
        list1.clear();
        list1.addAll(list2);
        return list1;
    }

    //Нахождение индекса элемента
    private static <T> int findElement(T[] array, T t) {
        for (int i = 0; i < array.length; i++) {
            if (t.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    //Объединение двух списков
    private static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }
}
