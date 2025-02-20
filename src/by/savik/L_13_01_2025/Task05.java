package by.savik.L_13_01_2025;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        System.out.println("Введите числа массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
