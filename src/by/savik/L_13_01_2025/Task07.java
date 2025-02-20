package by.savik.L_13_01_2025;

import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[arr.length + arr2.length];
        System.out.println("Введите числа в первый массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Введите числа во второй массив");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = arr.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr.length];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
