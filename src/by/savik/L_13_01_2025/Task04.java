package by.savik.L_13_01_2025;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Введите числа массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Введите искомое значение");
        int a = sc.nextInt();
        int b = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == a) {
                b = j;
            }
        }
        System.out.println(b);
    }
}
