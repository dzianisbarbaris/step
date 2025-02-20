package by.savik.L_13_01_2025;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE; // минимальный integer
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
