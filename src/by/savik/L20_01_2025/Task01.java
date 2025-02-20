package by.savik.L20_01_2025;

import by.savik.utils.ArrayUtil;

import java.sql.SQLOutput;
import java.util.Arrays;

import static com.sun.jndi.toolkit.dir.DirSearch.search;
import static java.util.Arrays.fill;

public class Task01 {
    public static void main(String[] args) {
        sort();
        search();
        fill();

    }

    private static void fill() {
        int[] a = new int[50];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 8);
        System.out.println(Arrays.toString(a));
    }

    private static void search() {
        int[] ints = ArrayUtil.generateIntArray(20, 0, 20);
        Arrays.sort(ints);
        int index = Arrays.binarySearch(ints,5);
        System.out.println(index >= 0 ? "Найден элемент по индексу " +index : "Не найден");

    }

    private static void sort() {
        int[] ints = ArrayUtil.generateIntArray(20, 0, 20);
        Arrays.sort(ints); // после этой строчки массив отсортирован
        System.out.println(Arrays.toString(ints));
    }
}
