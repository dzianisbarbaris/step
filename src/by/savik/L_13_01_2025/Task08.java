package by.savik.L_13_01_2025;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        int second = 0;
        System.out.println("Введите числа в массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
