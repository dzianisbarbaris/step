package by.savik.L_13_01_2025;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[arr.length - 1];
        int indexToRemove = 2;
        System.out.println("Введите числа массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < indexToRemove; i++) {
            arr2[i] = arr[i];
        }
        for (int i = indexToRemove; i < arr2.length; i++) {
            arr2[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
