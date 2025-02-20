package by.savik.L_13_01_2025;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int length = array.length;
        System.out.println(length);
        int a = array[5];
        for (int i = 0; i < length; i++) {
            array[i] = i * 13;
        }
        System.out.println(Arrays.toString(array));
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 98, 123, 3, 1};// так можно
        System.out.println(Arrays.toString(array2));
        int array3[] = new int[2];// в книжке написано, что можно, но так НЕ ДЕЛАТЬ!!!!
        int[] array4 = new int[]{1, 2, 3, 44, 6, 7}; // так тоже можно
        array4[2] = 48; // присваиваем новое значение третьему элементу массива
        System.out.println(Arrays.toString(array4));
        //array4[10] = 6; // индекса 10 не существует, поэтому будет ошибка (индекс массива вышел за рамки)
        char[] chars = new char[12]; // массив char-ов
        System.out.println(Arrays.toString(chars));
        char[] chars2 = new char[]{'a', 'b', 'g'}; // так тоже можно
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        for (char aChar : chars2) { // 1 - тип данных; 2 - тип переменной; 3 - название массива
            System.out.println(aChar);
        }
    }
}
