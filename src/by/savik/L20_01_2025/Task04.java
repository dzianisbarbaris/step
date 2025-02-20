package by.savik.L20_01_2025;

import by.savik.utils.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        copyArray();
        compareArray();
        sortArray();
        mergeArray();
    }

    public static void copyArray() {
        int[] array = ArrayUtil.generateIntArray(10, 0, 10);
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));
        int[] arrayCopyPart = Arrays.copyOf(array, 3);
        System.out.println(Arrays.toString(arrayCopyPart));
    }

    public static void compareArray() {
        int[] array = ArrayUtil.generateIntArray(10, 0, 10);
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));
        boolean equals;
        equals = Arrays.equals(array, arrayCopy);
        System.out.println(equals);
    }

    public static void sortArray() {
        int[] array = ArrayUtil.generateIntArray(10, 11, 100);
        Arrays.sort(array);
        System.out.println("Сортированный массив -> " + Arrays.toString(array));
        int a = array[array.length - 2];
        System.out.println(a);
    }

    public static void mergeArray() {
        int[] array = ArrayUtil.generateIntArray(4, 1, 10);
        int[] array2 = ArrayUtil.generateIntArray(5, 1, 10);
        Arrays.sort(array);
        System.out.println("Сортированный массив -> " + Arrays.toString(array));
        Arrays.sort(array2);
        System.out.println("Сортированный массив -> " + Arrays.toString(array2));
        int[] array3 = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array.length + i] = array2[i];
        }
        for (int i = 0; i < array3.length - 1; i++) {
            for (int j = 0; j < array3.length - 1 - i; j++) {
                if (array3[j] > array3[j + 1]) {
                    int temp = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = temp;
                }
            }
        }
        System.out.println("Новый массив " + Arrays.toString(array3));
    }
}
