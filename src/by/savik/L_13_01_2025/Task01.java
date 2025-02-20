package by.savik.L_13_01_2025;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива");
            array[i] = sc.nextInt();
        }
        for (int j : array) {
            sum += j;
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
