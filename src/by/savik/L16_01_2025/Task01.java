package by.savik.L16_01_2025;

import by.savik.utils.ArrayUtil;

import java.util.Arrays;

import static by.savik.utils.ArrayUtil.generateIntArray;

public class Task01 {
    public static void main(String[] args) {
//        deleteNumFromArray();
//        isPalindrome();
//        isIdentical();
//          isCouple();
//        countingNumbers();
//        findIndex();
//        findSum();
//        sortArray();
        sortArrayWhile();
    }

    private static void deleteNumFromArray() {

        int[] intArray = generateIntArray(10, 0, 60);
        int deleteIndex = 2; // удаляем элемент с индексом 2
        if (deleteIndex < intArray.length && deleteIndex >= 0) {
            int[] intArray2 = new int[intArray.length - 1];
            for (int i = 0, j = 0; i < intArray.length; i++) {
                if (deleteIndex == i) {
                    continue;
                }
                intArray2[i] = intArray[i];
                j++;
            }
        } else {
            System.out.println("Индекс вне диапазона");
        }
    }

    private static void isPalindrome() {
        int[] array = {1, 2, 3, 4, 3, 2, 1};
        boolean palindrome = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome ? "Симметричный" : "Не симметричный");
    }

    private static void isIdentical() {
        int[] array = {1, 1, 1, 1, 1, 1};
        boolean identical = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                identical = false;
                break;
            }
        }
        System.out.println(identical ? "Все элементы равны" : "Все элементы не равны");
    }

    private static void isCouple() {
        int[] array = {1, 5, 7, -1, 5};
        int k = 6;
        int couple = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    couple++;
                }
            }
        }
        System.out.println("Количество пар равно: " + couple);
    }

    private static void countingNumbers() {
        int[] array = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5};
        int numbers = 0;
        for (int k = 1; k < 6; k++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == k) {
                    numbers++;
                }
            }
            System.out.println(k + " встречается " + numbers + " - раз");
            numbers = 0;
        }
    }

    /*Дан массив int. Найти индекс элемента который удовлетворяет условиям.
            - Сам элемент не равен 0, и его соседние элементы тоже не равны 0.
            - Элемент должен делиться без остатка на оба соседних элемента (т.е. на предыдущий и следующий).
    Если такой элемент найден, вывести в консоль. Если таких элементов нет, вывести -1.*/
    private static void findIndex() {
        int[] array = {-2, 43, 12, 48, 24, -12, 17, 16};
        int index = 0;
        boolean ind = false;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] != 0 && array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                index = i;
                ind = true;
            } else {
                continue;
            }
        }
        System.out.println(ind ? +index : "-1");
    }

    /*Проверить, есть ли в массиве числа, дающие в сумме заданное значение
    Условие: Проверьте, существуют ли в массиве два числа, сумма которых равна k.*/
    private static void findSum() {
        int[] array = {10, 15, 3, 7};
        int k = 17;
        boolean sum = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    sum = true;
                }
            }
        }
        System.out.println(sum ? "Да" : "Нет");
    }

    /*Дан массив. Вывести числа по порядку, в обратном порядке, до середины, и после середины до конца в консоль.
        (четыре for в каждом свой вывод). И попробуйте это сделать так же через while.*/
    private static void sortArray() {
        int[] array = ArrayUtil.generateIntArray(10, 2, 20);
        System.out.println("Числа по порядку:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Числа в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Числа до середины:");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Числа после середины:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //    то же самое через while
    private static void sortArrayWhile() {
        int[] array = ArrayUtil.generateIntArray(10, 0, 20);
        System.out.println("Числа по порядку:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("Числа в обратном порядке:");
        i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
        System.out.println("Числа до середины:");
        i = 0;
        while (i < array.length / 2) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("Числа после середины:");
        i = array.length / 2;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }
}

